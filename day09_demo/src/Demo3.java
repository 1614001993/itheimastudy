import java.util.Random;
import java.util.Scanner;

public class Demo3 {
/*
3、分析并完成以下需求:
    1.使用随机数生成一个[1-100]的整数，提示用户猜一个整数
    2.根据用户猜的整数，与随机数比较判断，打印用户猜的结果（猜对了或猜小了、猜大了）
    3.多次游戏，猜对了停止游戏
*/

    public static void main(String[] args) {
        Demo1();
    }

    public static void Demo1() {
        Random rd = new Random();
        int r = rd.nextInt(99) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您猜的数字");
            int n = sc.nextInt();
            if (n > r) {
                System.out.println("您猜大了");
            } else if (n < r) {
                System.out.println("您猜小了");
            } else {
                System.out.println("您猜对了");
                break;
            }
        }
    }

}
