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

    public static void moneySave() {
        System.out.println("请输入月份（1~12）:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("请输入价钱:");
        double money = scanner.nextDouble();
        System.out.println("请输入座位等级代号(头等舱：1，次等仓：2):");
        int id = scanner.nextInt();
        if (month >= 5 && month <= 10) {
            if (id == 1) {
                double firstMoney = money * 0.9;
                System.out.println("头等舱的价格为" + firstMoney);
            } else if (id == 2) {
                double secondtMoney = money * 0.85;
                System.out.println("次等舱的价格为" + secondtMoney);
            } else {
                System.out.println("座位代号错误");
            }
        } else if ((month >= 1 && month < 5) || (month > 10 && month <= 12)) {
            if (id == 1) {
                double firstMoney = money * 0.7;
                System.out.println("头等舱的价格为" + firstMoney);
            } else if (id == 2) {
                double secondtMoney = money * 0.65;
                System.out.println("次等舱的价格为" + secondtMoney);
            } else {
                System.out.println("座位代号错误");
            }
        } else {
            System.out.println("您的月份输入无效，请重新输入");
        }
    }
}
