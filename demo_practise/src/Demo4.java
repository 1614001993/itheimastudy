public class Demo4 {
    public static void main(String[] args) {
        String str=numPass(9876);
        System.out.println(str);
    }
    //对数字进行加密
    public static String numPass(int num){

        int[] arr=splitArr(num);
        //加密每一位数
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        int[] arrNew=reverseArr(arr);
    //    将反转后的每一位数重新拼接起来
        String newNum="";
        for (int i = 0; i < arrNew.length; i++) {
                newNum+=arrNew[i];
        }
        return newNum;
    }
    //翻转数组
    public static int[] reverseArr(int[] arr) {
        for (int i=0,j=arr.length-1;i<j;i++,j--){
            int tmp;
            tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        return arr;
    }

    //分割字符
    public static int[] splitArr(int num) {
        int ge=(num%10+5)%10;
        int shi=(num/10%10+5)%10;
        int bai=(num/100%10+5)%10;
        int qian=(num/1000%10+5)%10;
        int[] arr={qian,bai,shi,ge};
        return arr;
    }

}
