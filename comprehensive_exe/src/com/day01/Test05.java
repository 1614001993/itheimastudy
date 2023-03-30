package com.day01;
// 5、分析并完成以下需求:
//
//         1.打印[1-1000]之间的整数，数字中包含5，或者是5的倍数的数字要跳过
//         2.要求控制台每行打印6个满足条件的数，之间用空格分隔

public class Test05 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (i % 5 == 0 || shi == 5 || bai == 5) {
                continue;
            }
            count++;
            System.out.print(i + " ");
            if (count % 6 == 0) {
                System.out.println();
            }

        }
    }

}
