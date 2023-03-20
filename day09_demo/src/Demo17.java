import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        Demo1(arr);
    }

    public static void Demo1(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个索引：");
        int n1 = sc.nextInt();
        System.out.println("请输入第一个索引：");
        int n2 = sc.nextInt();
        int temp;
        temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
