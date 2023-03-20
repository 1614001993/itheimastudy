public class Demo16 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(getIntAve(arr1));
        System.out.println(getIntMax(arr1));
        System.out.println(getIntMin(arr1));
        System.out.println(getIntSum(arr1));

        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(getDoubleAve(arr2));
        System.out.println(getDoubleMax(arr2));
        System.out.println(getDoubleMin(arr2));
        System.out.println(getDoubleSum(arr2));
    }

    //求和
    public static int getIntSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static Double getDoubleSum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

//    求最大值
public static int getIntMax(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}
public static Double getDoubleMax(double[] arr) {
    double max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}
//求最小值
public static int getIntMin(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
}
    public static Double getDoubleMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
//    求平均值
public static double getIntAve(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
    double ave=sum/arr.length;
    return ave;
}

    public static double getDoubleAve(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double ave = sum / arr.length;
        return ave;
    }
}
