package com.itheima.work;

import java.util.Random;

public class WorkTest {
    public static void main(String[] args) {
        // boolean flag = false;
        // int num = 10;
        // if (flag){
        //     num++;
        // }
        // num++;
        // if(num < 11){
        //     System.out.println("天生我材必有用");
        //     if (num > 5){
        //         System.out.println("千金散尽还复来");
        //     }
        // }
        // System.out.println("饿了么?");


        // int sum = 0;
        // int i = 1;
        // while(i < 3){
        //     sum += i;   //1 3
        //     i++;     //2 3
        // }
        // System.out.print("sum=" + sum);

        // int a = 10;
        // if(a % 2 == 0){
        //     System.out.println(a + "是偶数");
        // }

        // int count = 0;
        // int i = 2;
        // while(i < 7){
        //     if (i % 2 == 1){
        //         count++;   //0 1 2
        //     }
        //     i++;           //3 4 5 6 7
        // }
        // System.out.println(count);

        // String info = "itheima";
        // int a = 10, b = a++;
        // if (a > b) {
        //     System.out.println(info + ">>>" + (a + b));
        // } else {
        //     System.out.println("info" + ">>>" + a + b);
        // }


        // int x = 2;
        // switch (x){
        //     case 1:
        //         System.out.println(1);
        //     case 2:
        //     case 3:
        //         System.out.println(3);
        //     case 4:
        //         System.out.println(4);
        // }

        // int sum=0;
        // for(int i=1;i<=100;i++){
        //     sum+=i;
        //     System.out.println(i+"");
        //     if(sum>60){
        //         break;
        //     }
        // }

/*        分析以下需求并完成代码 //选做
        按照从大到小的顺序, 输出四位数中个位+百位=十位+千位的数字, 并统计个数
        每行输出7个满足条件的数, 之间用空格分隔*/


        // 个位  a%10
        // 十位  (a%100)/10
        // 百位  (a/100)%10
        //千位  (a/1000)
        // int count=0;
        // for (int i = 10000; i > 1000; i--) {
        //     if(i%10+(i/100)%10==(i%100)/10+i/1000){
        //         System.out.print(i+" ");
        //         count++;
        //
        //         if(count%7==0){
        //             System.out.println();
        //         }
        //     }
        // }
        // System.out.print("\n"+"总共有"+count+"个数");


        /*
	分析以下需求并完成代码 //选做
    	打印[1-1000]之间的整数, 数字中包含7或者是7倍数的数字要跳过
    	要求控制台每行打印5个满足条件的数, 之间用空格分隔
*/
        // int count = 0;
        // for (int i = 1; i < 1001; i++) {
        //     // if(i%7==0|(i%10)%7==0|((i/100)%10)%7==0|((i%100)/10)%7==0|(i/1000)%7==0){
        //     //     continue;
        //     // }
        //     if(i%7==0|i%10==7|(i%100)/10==7|(i/100)%10==7|(i/1000)==7){
        //         continue;
        //     }
        //     System.out.print(i + " ");
        //     count++;
        //     if (count % 5 == 0) {
        //         System.out.println();
        //     }
        // }
        // System.out.println("数量为"+"\n" + count);


        /*
	分析以下需求并完成代码 //暂时不写
		利用Random生成一个[10-100]之间的整随机数x，统计[10-x)之间奇数的个数
		最终在控制台打印所有的奇数以及个数
*/

        Random random = new Random();
        int num=random.nextInt(90)+10;
        System.out.println("随机数为"+num);
        int count=0;
        for (int i = 10; i < num; i++) {
            if(i%2==1){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("奇数的个数是"+count);
    }
}
