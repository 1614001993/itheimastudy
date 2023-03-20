import java.util.Scanner;

public class Demo2 {
    // 2、分析并完成以下需求:
    //
    //         1.模拟计算器，提示用户选择运算方式，[1加法/2减法/3乘法/4除法/5取余/0退出程序]
    //         2.提示用户分别录入两个整数，然后根据运算方式进行计算
    // 3.打印用户选择的运算方式，和运算结果（使用字符串拼接算式和结果）

    public static void main(String[] args) {

        Demo2();
    }

    public static void Demo2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入运算方式，[1加法/2减法/3乘法/4除法/5取余/0退出程序]：");
        int n = sc.nextInt();
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();
        switch (n) {
            case 0:
                System.out.println("退出程序");
                break;
            case 1:
                int sum = a + b;
                System.out.println(a+"+"+b+"="+sum);
                break;
            case 2:
                int reduce = a - b;
                System.out.println(a+"-"+b+"="+reduce);
                break;
            case 3:
                int cheng = a * b;
                System.out.println(a+"*"+b+"="+cheng);
                break;
            case 4:
                int chu = a / b;
                System.out.println(a+"/"+b+"="+chu);
                break;
            case 5:
                int yu = a % b;
                System.out.println(a+"%"+b+"="+yu);
                break;
            default:
                System.out.println("请输入正确的运算符");
        }


    }
}
