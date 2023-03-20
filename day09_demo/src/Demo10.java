public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 1, 8};
        int target = 9;
        Demo1(arr, target);
    }

    public static void Demo1(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int num = arr[i] + arr[j];
                if (num == target) {
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
