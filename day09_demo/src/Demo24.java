import java.util.Random;
import java.util.Scanner;

public class Demo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Demo1(arr);
    }

    //装元素
    public static void Demo1(int[] arr) {
        Random rd = new Random();
        int[] newArr = new int[3];
        int sum=0;
        for (int i = 0; i < newArr.length; i++) {
            int r = rd.nextInt(arr.length);
            newArr[i] = arr[r];
            sum+=newArr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
        System.out.println("和的值为"+sum);

    }
}
