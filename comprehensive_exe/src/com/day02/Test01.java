package com.day02;
/*01、分析并完成以下需求:

        1.定义一个方法，实现将指定int数组中的索引为偶数的元素值增加1
        2.假如数组为{1,2,3,4,5,6,7}，那么调用方法后，数组中的元素变为{2,2,4,4,6,6,8}
        3.main方法中，调用方法测试结果*/

public class Test01 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
       int[] arr1= Demo1(arr);
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
    public static int[] Demo1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(i%2==0){
                arr[i]+=1;
            }
        }
        return arr;
    }
}
