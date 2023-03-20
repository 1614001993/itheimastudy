import java.util.Scanner;

public class Demo23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Demo1(arr.length,arr);
    }
    //翻转数组
    public static void Demo1(int length,int[] arr){
        int[] newArr=new int[length];
        for (int i = 0,j=newArr.length-1; i < newArr.length; i++,j--) {

            if(arr[i]<0){
                arr[j]=0;
            }else{
                newArr[j]=arr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }

    }
}
