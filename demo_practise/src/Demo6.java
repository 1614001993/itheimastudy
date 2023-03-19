import java.util.Random;
import java.util.Scanner;

public class Demo6 {

    public static void main(String[] args) {
        int[] arr = {9, 666, 188, 520, 9999};
        Demo1(arr);
    }

    //抽奖
    public static void Demo1(int[] arr) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int num = rd.nextInt(arr.length);
            //一旦抽中，将该随机索引的值设置为0

            if (arr[num] != 0) {
                System.out.print("请第" + (i + 1) + "位员工抽奖：");
                System.out.println("请按任意键抽奖：");
                sc.next();
                System.out.println("恭喜您,您抽中了" + arr[num] + "元");
                arr[num] = 0;
            } else if (arr[num] == 0) {
                i--;
                continue;
            }
        }
    }
}
