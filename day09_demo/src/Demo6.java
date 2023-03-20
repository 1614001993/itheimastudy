import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
Demo1();
    }

    public static void Demo1() {
        Scanner sc = new Scanner(System.in);

        int[] arr=new int[10];
        System.out.println("请输入10个整数:");
        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i]=n;
        }
        int count;
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count1++;
            }
            if(arr[i]==2){
                count2++;
            }
            if(arr[i]==3){
                count3++;
            }
        }
        count=arr.length-count1-count2-count3;
        System.out.println("数字1的个数为"+count1);
        System.out.println("数字2的个数为"+count2);
        System.out.println("数字3的个数为"+count3);
        System.out.println("非法字符的个数为"+count);
    }
}
