package sort_aruthmetic;

public class SelectionSort1 {
    public static void main(String[] args) {
        // int[] arr = {1, 4, 2, 6, 8, 3, 5, 6, 9};
        int[] arr = {4,6,8,7,9,2,11};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr1) {
        //    确定循环次数
        for (int x = 0; x < arr1.length - 1; x++) {
            //    将最小值交换
            int min = x;
            for (int i = x ; i < arr1.length; i++) {
                if (arr1[i] < arr1[min]) {
                    min = i;
                }
                int temp = arr1[min];
                //与最左边元素交换
                arr1[min]=arr1[x];
                arr1[x] = temp;
            }
        }
        Print(arr1);
    }

    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
