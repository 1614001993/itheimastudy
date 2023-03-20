import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        Demo1();
    }
    public static void Demo1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入手机号码：");
        String n=sc.next();
        String head=n.substring(0,3);
        String body=n.substring(3,7);
        String foot=n.substring(7,11);
        int heads=Integer.parseInt(head);
        int bodys=Integer.parseInt(body);
        int foots=Integer.parseInt(foot);
        System.out.println(heads);
        System.out.println(bodys);
        System.out.println(foots);
        if(heads!=132||heads!=134||heads!=135){
            System.out.println("电话号码开头有误");
        }
        if(n.length()!=11){
            System.out.println("手机号位数有误");
        }
    }
}
