package com.test;
/*8、分析并完成以下需求：

        1.按照从大到小的顺序输出四位数中的：个位+百位=十位+千位 的数字及个数
        2.每行输出5个满足条件的数，之间用空格分隔
        如：9999 9988 9977 9966 9955*/

public class Test08 {
    public static void main(String[] args) {
            int count = 0;
            for (int i = 9999; i >1000; i--) {
                int ge = i % 10;
                int shi = i / 10 % 10;
                int bai = i / 100 % 10;
                int qian=i/1000%10;
                if (ge+bai==shi+qian) {
                    System.out.print(i+" ");
                    count++;
                    if(count%5==0){
                        System.out.println();

                    }                }


        }

    }
}
