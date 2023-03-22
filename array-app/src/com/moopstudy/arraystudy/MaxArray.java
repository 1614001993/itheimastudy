package com.moopstudy.arraystudy;

public class MaxArray {

    //求一个数组中的最大值和最小值
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 4, 6, 8, 35, -6};
        int max = arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值"+max);
        System.out.println("最小值"+min);
    }

}
