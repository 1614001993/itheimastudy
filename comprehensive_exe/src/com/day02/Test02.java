package com.day02;

import java.util.Random;

/*02、分析并完成以下需求:

        1.定义方法getMax()获取数组最大值、getMin()获取最小值、getAvg()获取元素平均值
        2.在main方法中，生成一个长度为10的随机数组arr，元素范围是[1-100]
        3.分别调用三个方法，传递该数组，接收返回值并打印*/
public class Test02 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random rd=new Random();
        for (int i = 0; i < arr.length; i++) {
            int r=rd.nextInt(100)+1;
            arr[i]=r;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max=getMax(arr);
        int min=getMin(arr);
        double avg=getAvg(arr);
        System.out.println("最大值"+max+"，最小值"+min+"，平均值"+avg);

    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
                int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static double getAvg(int[] arr){
        int sum=0;
        double avg=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
        }
        avg=sum*1.0/arr.length;
        return avg;
    }
}
