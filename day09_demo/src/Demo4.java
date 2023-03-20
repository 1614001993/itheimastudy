import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
    takeMoney();

    }
    public static Boolean passWord(){
        int password=111111;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入密码：");
        for (int i = 0; i < 3; i++) {
            int n=sc.nextInt();
            if(n!=password){
                if(i!=2){
                    System.out.println("密码错误，请重新输入：");
                }
                else{
                    System.out.println("三次密码错误，请取回您的卡片");
                }
                continue;
            }
            if(n==password){
                System.out.println("密码输入正确，可以取款");
                return true;
            }
        }
        return false;
    }
    public static void takeMoney(){

        Boolean pass=passWord();
        if(pass){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入您的取款金额：");
            while(true){

                int money=sc.nextInt();
                if(money!=0&&money<=1000&&money%100==0){
                    System.out.println("请取走现金"+money);
                    System.out.println("交易完成，请取卡");
                    break;
                }
                else{
                    System.out.println("您的取款金额有误，请重新输入：");
                }
            }
        }


    }
}
