package com.itheima.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);

        // 1.把本地文件中正确的用户名和密码获取到
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("online_store\\src\\com\\itheima\\InfoTxt\\userinfo.txt");
        prop.load(fis);//加载键值对对象   参数类型需要流
        fis.close();

        // 2.只要客户端来了就开启一个线程
        while (true){
            Socket socket = ss.accept();
            System.out.println("有大冤种来连接");
            new Thread(new MyRunnable(socket,prop)).start();
        }
    }
}
class MyRunnable implements Runnable{
    Socket socket;
    Properties prop;
    public MyRunnable(Socket socket, Properties prop) {
        this.socket = socket;
        this.prop = prop;
    }

    @Override
    public void run() {
        // 接收用户发送的数据
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String choose = br.readLine();
                switch (choose){
                    case "login"-> login(br);
                    case "registr"-> System.out.println("用户选择了注册操作");
                }
            }
            // System.out.println(line);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    // 获取用户登录时，传递过来的参数
    // 并进行判断
    public void login(BufferedReader br) throws IOException {
        System.out.println("用户选择了登录操作");
        String userinfo = br.readLine();
        //"&"字符通常用作HTTP请求参数中键值对之间的分隔符。
        String[] userInfoArr = userinfo.split("&");
        String usernameInput = userInfoArr[0].split("=")[1];
        String passwordInput = userInfoArr[1].split("=")[1];
        System.out.println("用户输入的用户名为："+usernameInput);
        System.out.println("用户输入的密码为："+passwordInput);
        if (prop.containsKey(usernameInput)){
            // 如果用户名存在继续判断密码
            String rightPassword = prop.get(usernameInput) + "";//什么后边加上字符串都会变成字符串
            if (rightPassword.equals(passwordInput)){
                // 密码正确的话，开始聊天
                writeMessage2Client("1");
                // 登录成功的时候，就需要把客户端的连接对象Socket保存起来

                // 写一个while   模拟聊天、
                // BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // TODO 接收客户端发送过来的消息，并打印在控制台上
                talk2All(br,usernameInput);

                while (true){

                }
            }else {
                // 密码错误
                writeMessage2Client("2");
            }
        }else {
            // 用户名不存在，请先注册
            writeMessage2Client("3");
        }
    }

    private void talk2All(BufferedReader br,String username) throws IOException {
        while (true){
            String message = br.readLine();
            System.out.println(username+"发送过来消息："+message);

        }
    }

    // 将消息回写给客户端
    public void writeMessage2Client(String Messsage) throws IOException {
        // 获取Socket的输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 将传入的message信息回写
        bw.write(Messsage);
        bw.newLine();
        bw.flush();
    }
}