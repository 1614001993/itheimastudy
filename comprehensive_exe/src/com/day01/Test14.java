package com.day01;


import java.util.Scanner;

/*14、分析并完成以下需求:

        1.定义一个方法getSum(int start, int end){ … }，该方法完成获取[start-end]范围中的数据的和
        2.在main方法中提示，并键盘录入start和end(start小于end，需要判断)，调用方法传递参数，打印结果*/
public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个数（需大于第一个数）");
        int n2 = sc.nextInt();
        while (true) {
            if (n2 > n1) {
                break;
            }
            System.out.println("请重新输入第二个数：（需要大于" + n1 + "）");
            n2 = sc.nextInt();
        }
        getSum(n1, n2);

    }

    public static void getSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(start + "~" + end + "的和为：" + sum);

    }
}
