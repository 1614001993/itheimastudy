package com.test01;

/*
题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
        例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。*/
public class Demo03 {
    public static void main(String[] args) {
        isShuiXian();
    }

    public static void isShuiXian() {
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(i);
            }
        }


    }
}

// public class Demo03{
//     public static void main(String[] args){
//         for(int i=100;i<1000;i++){
//             if(isLotus(i))
//                 System.out.print(i+" ");
//         }
//         System.out.println();
//     }
//     //判断水仙花数
//     private static boolean isLotus(int lotus){
//         int m = 0;
//         int n = lotus;
//         int sum = 0;
//         m = n/100;
//         n  -= m*100;
//         sum = m*m*m;
//         m = n/10;
//         n -= m*10;
//         sum += m*m*m + n*n*n;
//         if(sum==lotus)
//             return true;
//         else
//             return false;
//     }
// }

