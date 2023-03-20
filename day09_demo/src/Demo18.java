import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
        Demo1();

    }
    public static void Demo1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串（包含数字字母）");
        String str=sc.next();
        char[] arr=str.toCharArray();
        String str1="";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if((int)(arr[i])>=97&&(int)(arr[i])<=122){
                str1+=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=57&&arr[i]>=48){
                str1+=arr[i];
            }

        }
        System.out.println(str1);
    }
}
