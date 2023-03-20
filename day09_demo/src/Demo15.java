public class Demo15 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77};
        Demo1(arr);
    }
    public static void Demo1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                arr[i]=arr[i]+1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
