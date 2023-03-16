package com.itheima.define;

public class ArrEqual {


    public static void main(String[] args) {
        int[] a=new int[]{22,33,55,77};
        int[] b=new int[]{22,33,44,55};
        int[] c=new int[]{22,33,55,77};
        int[] d=new int[]{22,33,44,55,88,99};
        int[] e=new int[]{22,33,55,77,99};
        System.out.println(arrEqual(a,b));
        System.out.println(arrEqual(a,c));
        System.out.println(arrEqual(a,d));
        System.out.println(arrEqual(a,e));


    }
    //写一个方法，判断两个数组是否相同，如果他的长度，对应位置的元素相同，则认为这两个数组相同

    public static Boolean arrEqual(int[] a, int[] b){
        if(a.length==b.length){
            for (int i = 0; i < a.length; i++) {
                if(a[i]!=b[i]){
                    return false;
                }
            }
            return true;
        }
            return false;

    }
}
