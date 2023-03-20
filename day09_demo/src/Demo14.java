import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int start = sc.nextInt();
        System.out.println("请输入第二个数");
        int end = sc.nextInt();
        if (start < end) {
        int num=getSum(start,end);
            System.out.println(num);
        }else{
            System.out.println("数据不合格");
        }
    }

    public static int getSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
