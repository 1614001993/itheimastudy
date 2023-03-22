package com.apistudy.stringstudy;

public class StringApi {

    public static void main(String[] args) {
        // 1、获取字符串的长度
        String str = "这是一个字符串";
        String str1 = "这是一个字符串";
        int length = str.length();
        System.out.println(length);
// 2、提取字符串中某个索引位置处的字符
        char s = str.charAt(3);
        System.out.println(s);
// 3、把字符串转换成字符数组
        char[] arr = str.toCharArray();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
// 4、判断字符串内容，内容一样就返回true
        Boolean ifT = str.equals(str1);
        System.out.println(ifT);
// 5、忽略大小写比较字符串内容
        String str2 = "abcdefg";
        String str3 = "aBcdEfg";
        Boolean ifT1 = str2.equalsIgnoreCase(str3);
        System.out.println(ifT1);
// 6、截取字符串内容 (包前不包后的)
        String newStr = str.substring(3, 6);
        System.out.println(newStr);
// 7、从当前索引位置一直截取到字符串的末尾
        String newStr1 = str.substring(3);
        System.out.println(newStr1);
// 8、把字符串中的某个内容替换成新内容，并返回新的字符串对象给我们
        String newStr2 = str.replace("个", "串");
        System.out.println(newStr2);
// 9、判断字符串中是否包含某个关键字
        Boolean ifC = str.contains("字");
        System.out.println(ifC);
// 10、判断字符串是否以某个字符串开头。
        Boolean ifS = str.startsWith("这");
        System.out.println(ifS);
// 11、把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回给我们
        String[] newArr = str.split("");
        String[] newArr1 = str.split("一");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < newArr1.length; i++) {
            System.out.print(newArr1[i] + " ");
        }
    }
}
