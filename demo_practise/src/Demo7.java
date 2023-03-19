public class Demo7 {

    //找素数
    public static void main(String[] args) {
        int n=findSuShu(101,200);
        System.out.println("素数的个数为"+n+"个");
    }
    public static int findSuShu(int n,int m){
        // 先对n~m范围做一个遍历
        int count=0;
        for (int i = n; i <= m; i++) {
            Boolean isSuShu=true;
            //判断他能不能被除了1和本身整除
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isSuShu=false;
                    break;
                }
            }
            if(isSuShu){
                System.out.println(i);
                count++;
            }

        }
        return count;
    }

}
