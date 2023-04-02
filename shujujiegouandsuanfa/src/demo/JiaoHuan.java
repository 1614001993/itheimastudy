package demo;

public class JiaoHuan {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12,0};
        moveZero(arr);
    }
    public static void moveZero(int[] nums){

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i]==0){
                    nums[i]=nums[i+1];
                    nums[i+1]=0;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }


    }
}
