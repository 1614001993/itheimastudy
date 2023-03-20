public class Demo9 {
    public static void main(String[] args) {
        Demo1();
    }
    //计算5位数的回文数
    public static void Demo1() {
        int count = 0;
        int count1 = 0;
        for (int i = 10000; i < 100000; i++) {
            //分割字符串
            Boolean isT = splitNum(i,5);
            if (isT) {
                count++;
            }
        }
        for (int i1 = 1000000; i1 < 10000000; i1++) {
            //分割字符串
            Boolean isT1 = splitNum(i1,7);
            if (isT1) {
                count1++;
            }
        }
        System.out.println("五位数的回文数有"+count+"位");
        System.out.println("七位数的回文数有"+count1+"位");
        System.out.println("他们之间相差"+(count1-count)+"位");
    }

    //分割数字为数组,判断是否为回文数，是返回true，否返回false
    public static Boolean splitNum(int i,int n) {
        int[] arr = new int[n];
        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 100 % 10;
        int qian = i / 1000 % 10;
        int wan = i / 10000 % 10;
        arr[0] = ge;
        arr[1] = shi;
        arr[2] = bai;
        arr[3] = qian;
        arr[4] = wan;
        if(n==7){
            int shiwan = i / 100000 % 10;
            int baiwan = i / 1000000 % 10;
            arr[5] = shiwan;
            arr[6] = baiwan;
        }
        for (int i1 = 0, j = arr.length - 1; i1 < j; i1++, j--) {
            if (arr[i1] != arr[j]) {
                return false;
            }
        }
        return true;

    }
}
