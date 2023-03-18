import java.util.Scanner;
public class Demo1 {

//用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，
// 优惠方案如下：
// 5-10月为旺季，头等舱9折，经济舱8.5折；
// 11月到来年4月为淡季，头等舱7折，经济舱6.5折，
// 请开发程序计算出用户当前机票的优惠价。
public static void main(String[] args) {
moneySave();
}
public static void moneySave(){
    System.out.println("请输入月份（1~12）:");
    Scanner scanner = new Scanner(System.in);
    int month=scanner.nextInt();
    System.out.println("请输入价钱:");
    double money=scanner.nextDouble();
        if(month>=5 && month<=10){
            double firstMoney=money*0.9;
            double secondtMoney=money*0.85;
            System.out.println("头等舱的价格为"+firstMoney);
            System.out.println("次等舱的价格为"+secondtMoney);
        }else if((month>=1&&month<5)||(month>10&&month<=12)){
            double firstMoney=money*0.7;
            double secondtMoney=money*0.65;
            System.out.println("头等舱的价格为"+firstMoney);
            System.out.println("次等舱的价格为"+secondtMoney);
        }
        else{
            System.out.println("您的月份输入无效，请重新输入");
    }
}
}
