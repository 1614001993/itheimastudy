import java.util.Random;
import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num=random.nextInt(61)+7;
            arr[i]=num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入3-5之间的整数");
        int guest=scanner.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%guest==0){
                System.out.println(arr[i]);
                count++;
            }
        }
        if(count==0){
            System.out.println("结果为空");
        }
    }
}
