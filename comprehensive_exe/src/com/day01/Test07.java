package com.day01;

/*7、分析并完成以下需求：

        1.完成逢七过游戏
        2.获取范围[1-100]的整数，如果是7的倍数的、或者包含7的要跳过，打印满足条件的数字*/
public class Test07 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (i % 7 == 0 ||ge==7|| shi == 5 ) {
                continue;
            }
            count++;
            System.out.print(i + " ");
            if (count % 7 == 0) {
                System.out.println();
            }

        }
    }

}
