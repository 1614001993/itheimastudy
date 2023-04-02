package sort_aruthmetic;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 6, 8, 9, 3, 6};
        Bubble(arr);
    }
    //冒泡排序
    public static void Bubble(int[] arr) {
        int j = 0;
        //控制排序进行的次数
        while (j < arr.length - 1) {
            int temp;
            //每次两两进行比较，如果前一个大于后一个，则交换，否则继续比较下一个
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i + 1] < arr[i]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            //每一轮排序完成的最后一个值必为最大值，不参与下一轮比较
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}
