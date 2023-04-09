package com.itheima.Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建连接
        Socket socket = new Socket("127.0.0.1",10002);
        System.out.println("服务器已经连接成功");

        while (true) {
            System.out.println("===============欢迎来到客户商家对喷系统===============");
            System.out.println("1.登录");
            System.out.println("2.注册");

            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();

            switch (choose){
                case "1"-> login(socket);
                case "2"-> System.out.println("用户选择了注册");
                default -> System.out.println("没有这个选项");
            }
        }

    }
    public static void login(Socket socket) throws IOException {
        // 获取socket的输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        // 按照格式拼接
        StringBuilder sb = new StringBuilder();
        sb.append("username=").append(username).append("&password=").append(password);

        // 告诉服务器正在进行什么操作
        bw.write("login");
        bw.newLine();
        bw.flush();
        // 往服务器写出用户名和密码
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

        // 获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
        // 1.登陆成功     2.密码错误    3.用户名不存在
        if ("1".equals(message)){
            System.out.println("登录成功，开始聊天");
            // 用while模拟聊天  开始聊天
            talk2All(bw);
            while (true){

            }
        }
    }

    // 往服务器写出消息
    private static void talk2All(BufferedWriter bw) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你要说的话");
            String message = sc.nextLine();
            // 把聊天内容传给服务器
            bw.write(message);
            bw.newLine();
            bw.flush();

        }
    }
}