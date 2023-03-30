package com.day02;
/*
11、给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。(默认字符串全为小写字母)
        示例:
        s = "leetcode"
        返回 0
        s = "loveleetcode"
        返回 2
*/
public class Test11 {
    public static void main(String[] args) {
        // String str="leetcode";
        String str="loveleetcode";

        char[] arr=new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
           arr[i]= str.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            Boolean res=true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    res=false;
                    break;
                }
            }
            if(res){
                System.out.println("第"+i+"个字母为首个不重复的数字");
                break;
            }
        }
    }
}
