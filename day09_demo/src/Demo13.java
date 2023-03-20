import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50,28};
        int test=Demo1(arr);
        if(test!=0){
            System.out.println(test);
        }else{
            System.out.println("没有这个数");
        }
    }

    public static int Demo1(int[] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return 0;
    }
}
