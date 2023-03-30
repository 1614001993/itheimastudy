package com.day02;

import java.util.Random;

/*10、分析并完成以下需求：

        1.将数字{3,2,11,22,44,55,66...}}保存到一个长度为10的数组中
        2.定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
        3.给新数组的元素赋值
        4.求新数组所有元素的和*/
public class Test10 {
    public static void main(String[] args) {
        Random rd=new Random();
        int[] arr={3,2,11,22,44,55,66,77,88,99};
        int[] newArr=new int[3];
        int sum=0;
        for (int i = 0; i < newArr.length; i++) {
            int r=rd.nextInt(10);
            newArr[i]=arr[r];
            sum+=newArr[i];
        }
        System.out.println(sum);

    }

}
