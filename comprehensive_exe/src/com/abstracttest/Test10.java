package com.abstracttest;

import java.util.ArrayList;

/*10、给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。

        示例：
        输入：nums = [2,7,11,15,1,8], target = 9
        输出：[0,1] [4,5]
        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。*/
public class Test10 {
    public static void main(String[] args) {
        ArrayList<int[]> arr=Demo1();
        for (int i = 0; i < arr.size(); i++) {
            int[] arr1=arr.get(i);
            System.out.println("["+arr1[0]+","+arr1[1]+"]");
        }
    }

    public static ArrayList<int[]> Demo1() {
        ArrayList<int[]> ints = new ArrayList<>();
        int[] nums = {2, 7, 11, 15, 1, 8};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] arr={i,j};
                    ints.add(arr);
                }
            }
        }
        return ints;
    }
}
