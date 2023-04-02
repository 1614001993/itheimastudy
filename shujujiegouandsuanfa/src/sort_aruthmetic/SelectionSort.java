package sort_aruthmetic;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 8, 3, 5, 6, 9, 1, 2, 3};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        //    确定循环次数
        for (int j = 0; j < arr.length - 1; j++) {
            System.out.println("第"+(j+1)+"次交换");
            //    将最小值交换
            int min = j;
            for (int i = j ; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
                int temp = arr[min];
                //与最左边元素交换
                arr[min]=arr[j];
                arr[j] = temp;
            }
            Print(arr);
            System.out.println();
        }


    }

    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
