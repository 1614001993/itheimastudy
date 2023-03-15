package com.itheima.forwhile;

public class ForDemo {
    public static void main(String[] args) {
        //打印1~100
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }

    //    求1~100的奇数和
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println(sum);

        int sum2=0;
        for (int i = 1; i <=100 ; i+=2) {
            sum2+=i;

        }
        System.out.println(sum2);
        //折纸
        int cishu=0;
        for(double i=0.1;i<=8848860;i*=2){
            cishu++;
        }
        System.out.println("需要折叠"+cishu+"次");
    //    我爱你 循环嵌套
        for(int i=1;i<=5;i++){
            for(int m=1;m<=3;m++){
                System.out.println("I Love You ");
            }
        }
    //    使用*号打印出来4行5列的矩形
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('*'+ " ");
            }
            System.out.println();
        }

    //    跳转关键字  break，continue
        for (int i = 0; i < 5; i++) {
            if(i==3){
                break;
            }
            System.out.println("我爱你");

        }
        for (int i = 1; i <= 5; i++) {
            if(i==3){
                continue;
            }
            System.out.println("洗碗"+i);
        }
    }

}
