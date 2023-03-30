package com.day02;
/*08、分析并完成以下需求:

        1.定义一个int类型数组{22,56,8,97,99,46,53,2,13}，用自己的方式最终实现：
        2.奇数放在数组的左边，偶数放在数组的右边（可以创建其他数组，不必须在原数组中改变）*/
public class Test08 {
    public static void main(String[] args) {
        int[] arr={22,56,8,97,99,46,53,2,13};
        int[] newArr=rev(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" n");
        }
    }

    private static int[] rev(int[] arr) {
        int[] newArr=new int[arr.length];
        int start=0;
        int end=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                newArr[start]=arr[i];
                start++;
            }
            else{
                newArr[end]=arr[i];
                end--;
            }
        }
        return newArr;
    }
}
