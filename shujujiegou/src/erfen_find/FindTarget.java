package erfen_find;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {11, 13, 17, 19, 45, 77, 79, 80};
        int target = 17;
        int index=findTarget1(target, arr);
        System.out.println(index);
    }
    //    二分查找  基础版  数组升序或者降序排列
    public static int findTarget1(int target, int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i<=j) {
            int m = (i + j) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                j = m - 1;
            }else{
                i=m+1;
            }        }
        return -1;
    }
}
