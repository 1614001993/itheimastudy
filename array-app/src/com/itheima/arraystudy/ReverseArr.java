package com.itheima.arraystudy;

import org.w3c.dom.ls.LSOutput;

public class ReverseArr {
    //    将一个数组翻转过来
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,55};

        for (int i=0, j=arr.length-1; i<j ; i++,j--) {
                int test;
                test=arr[i];
                arr[i]=arr[j];
                arr[j]=test;
        }
        for (int t = 0; t < arr.length; t++) {
            System.out.println(arr[t]);
        }
    }

}
