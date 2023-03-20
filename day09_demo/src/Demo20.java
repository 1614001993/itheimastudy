import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        System.out.print("请输入字符串：");
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        Boolean ifT=Demo3(n);
        // ifT

    }

    //判断是否符合条件
    public static Boolean Demo3(String str) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请录入字符串");
        // String str = sc.next();
        char[] ch = Demo1(str);
        for (int i = 0; i < ch.length; i++) {
            Boolean daXie = 97 <= (int) (ch[i]) && (int) (ch[i]) <= 122;
            Boolean xiaoXie = 65 <= (int) (ch[i]) && (int) (ch[i]) <= 90;
            if(daXie||xiaoXie){
                return true;
            }
        }
        return false;
    }


    //将字符串分割为char类型的数组
    public static char[] Demo1(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
        return ch;
    }
//    判断字符串中大小写出现的次数并打印
//     public static void Demo2(String str){
//        Boolean ifT =Demo3(str)
//     }
}
