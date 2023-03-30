package com.day02;

import java.util.Scanner;

/*09、分析并完成以下需求：

        1.假设有一个长度为5的数组，数组元素通过键盘录入，如下所示：
        int[] arr = {1,3,-1,5,-2};
        2.要求：
        创建一个新数组newArr[]
        新数组中元素的存放顺序与原数组中的元素逆序
        并且如果原数组中的元素值小于0在新数组中按0存储
        最后输出原数组和新数组中的内容*/
public class Test09 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数");
            int n=sc.nextInt();
            arr[i]=n;
        }
        int[] newArr=new int[arr.length];
    //    逆序
        for (int i = 0,j=arr.length-1; i < arr.length; i++,j--) {
            if(arr[i]<0){
                newArr[j]=0;
            }else{
                newArr[j]=arr[i];
            }

        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }


    }
}
