package demo;


public class GuPiao {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        // int[] arr = {7, 6,4,3,1};
        int reduce=Demo1(arr);
        System.out.println(reduce);
    }

    public static int Demo1(int[] prices) {
        // int  reduce = prices[1] - prices[0];
        // for (int i = 0; i < prices.length - 1; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {
        //         //卖出价钱必须大于买入价钱
        //         if (reduce < 0) {
        //             reduce=0;
        //             continue;
        //         } else {
        //             if (prices[j] - prices[i] > reduce) {
        //                 reduce = prices[j] - prices[i];
        //                 // inter=i;
        //                 // out=j;
        //             }
        //         }
        //     }
        // }
        // // System.out.println("第"+inter+"天买入,第"+out+"天卖出");
        // return reduce;
        // int min = Integer.MAX_VALUE;
        // int max = 0;//最大利润
        // for (int i = 0; i < prices.length; i++) {
        //     if(prices[i] < min){
        //         min = prices[i];
        //     }else if(prices[i] - min > max){
        //         max = prices[i] - min;
        //     }
        // }
        // return max;


        int min = prices[0]; // 初始化最小值为第一天的价格
        int max = 0; // 初始最大收益为0
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

}
