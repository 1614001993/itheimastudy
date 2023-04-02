package com.abstracttest;

/*9、分析并完成以下需求：

        1.计算出5位数的回文数和7位数的回文数相差了多少个?
        2.回文数是一种数字如：98789倒读也为98789正读倒读都一样这种数字就叫回文数*/
public class Test09 {
    public static void main(String[] args) {
        //计算5位数的回文数
        int count=0;
        for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 1000 % 10;
            int wan =i/10000%10;
            if(ge==wan&&shi==qian){
                System.out.print("五位数的回文数有"+count+"个");
                count++;
                if(count%8==0){
                    System.out.println();
                }
            }
        }
        //计算5位数的回文数
        int count1=0;
        for (int i = 1000000; i < 10000000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int wan =i/10000%10;
            int shiwan=i/100000%10;
            int baiwan =i/1000000%10;
            if(ge==baiwan&&shi==shiwan&&bai==wan){
                System.out.print(i+" ");
                count1++;
                if(count1%8==0){
                    System.out.println();
                }
            }
        }
        System.out.println("七位数的回文数有"+count1+"个");
        System.out.println("他们之间相差"+(count1-count)+"个");
    }
}
