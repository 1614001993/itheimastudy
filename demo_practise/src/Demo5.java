public class Demo5 {
    public static void main(String[] args) {
        int[] arr={3,7,4,6,9,11,22};
        int[] arr1=Demo1(arr);
        Demo2(arr1);
    }
    //复制数组
    public static int[] Demo1(int[] arr){
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        return arr1;
    }
    //输出数组
    public static void Demo2(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }
        }

    }
}
