package demo;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.Predicate;

public class JiaoJi {
    public static void main(String[] args) {
        // int[] arr1={1,2,2,1};
        // int[] arr2={2,2};
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8,5, 4};
        int[] num = Demo1(arr1, arr2);
        /*for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }*/
        // Arrays.stream(num).filter()
        System.out.println(Arrays.toString(num));
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : num) {
            ts.add(i);

        }
        System.out.println(ts);


    }

    public static int[] Demo1(int[] nums1, int[] nums2) {
        int count=0;
        // int[] arr=new int[6];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    count++;
                }
            }
        }

        int[] arr = new int[count];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    arr[k++] = nums1[i];
                }
            }
        }
        int[] arrr={1,1,2,2,3,3,4};
        int count1=0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                if(arr[i]==arr[i+1]){
                    count1++;
                }
            }
        }
       return arr;
    }
}
