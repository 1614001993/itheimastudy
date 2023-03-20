import java.util.Scanner;

public class Demo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int num=Demo1(n);
        System.out.println(num);
    }

    public static int Demo1(String n) {
        char[] arr=splitStr(n);

        for (int i = 0; i < arr.length; i++) {
            Boolean index=false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    index=true;
                    break;
                }
            }
            if(!index){
                return i;
            }
        }
        return -1;
    }

    public static char[] splitStr(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");

        }
        System.out.println();
        return ch;
    }
}
