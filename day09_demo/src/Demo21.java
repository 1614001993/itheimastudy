import java.util.Scanner;

public class Demo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入身份证号码：");
        String n = sc.next();
        Demo1(n);

    }

    //判断
    public static Boolean Demo1(String str) {
        char[] newArr = Demo2(str);
        char last = newArr[newArr.length - 1];
        if (newArr.length != 18) {
            System.out.println("身份证位数有误");
            return false;
        } else if (newArr[0]=='0') {
            System.out.println("开头不能为0");
            return false;
        } else if (last != 'X'&&last<48&&last>57) {
            System.out.println("最后一位数必须为数字或者X");
            return false;
        } else {
            for (int i = 1; i < newArr.length - 1; i++) {
                if (newArr[i] > 57 || newArr[i] < 48) {
                    System.out.println("身份证号中间必须为数字");
                    return false;
                }
            }
        }
        System.out.println("省份证号合法");
        return true;
    }

    //分割身份证字符串
    public static char[] Demo2(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");

        }
        System.out.println();
        return ch;

    }

}
