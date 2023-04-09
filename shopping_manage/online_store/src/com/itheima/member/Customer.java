package com.itheima.member;

import com.itheima.Store;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.itheima.member.Seller.showGoods;

public class Customer {
    private static Scanner sc = new Scanner(System.in);
    private static Random r = new Random();

    //类别
    private int type = 1;
    //姓名
    private String userName;
    //账户名
    private String account;
    //密码
    private String passWord;
    //余额
    private double balance;
    //消费金额
    private double consume;
    //VIP
    private int vip;
    //电话
    private String phoneNumber;

    public Customer() {
    }

    public Customer(int type, String userName, String account, String passWord, double balance, double consume, int vip, String phoneNumber) {
        this.type = type;
        this.userName = userName;
        this.account = account;
        this.passWord = passWord;
        this.balance = balance;
        this.consume = consume;
        this.vip = vip;
        this.phoneNumber = phoneNumber;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getConsume() {
        return consume;
    }

    public void setConsume(double consume) {
        this.consume = consume;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //购买商品
    public void buy(ArrayList<Goods> goods, Customer customer,ArrayList<Seller> sellers,ArrayList<Order> orders) throws InterruptedException {
        showGoods();

        double temp = 0;
        //死循环，多次输入
        while (true) {
            System.out.println("请输入您要购买的商品名称：");
            String buyGoodsName = sc.next();
            Goods goods1 = null;
            goods1 = judgeExist(buyGoodsName,goods);
            //定义临时变量，用来存储商家的余额
            temp = 0;
            if (judgeExist(buyGoodsName,goods) != null){
                System.out.println("存在该商品~");
                System.out.println("请输入您要购买的商品数量：");
                int buyGoodsNum = sc.nextInt();
                if (goods1.getStock() >= buyGoodsNum){
                    //购买这些商品的花费
                    double spend = 0;
                    spend = goods1.getPrice() * buyGoodsNum;
                    //定义变量level接受vip等级
                    int level = customer.vipLevel();
                    //定义变量计算打折后的金额
                    double realSpend = 0;
                    switch (level){
                        //vip等级为0级
                        case 0:
                            realSpend = spend;
                            while (true) {
                                //如果余额足够支付
                                if (customer.getBalance() >= realSpend) {
                                    System.out.println("你个穷鬼还想要优惠~");
                                    System.out.println("消费 " + realSpend + "元，赶紧拿走不退！");
                                    //更新用户的消费金额
                                    customer.setConsume(customer.getConsume() + realSpend);
                                    System.out.println("您当前的会员等级为vip" + customer.vipLevel() + "，请继续努力！");
                                    break;
                                }else {    //余额不足时
                                    Thread.sleep(500);
                                    System.out.println("账户余额不足，赶紧去充个十万八万的~");
                                    Thread.sleep(1000);
                                    System.out.println("您的账户余额为:" + customer.getBalance() + "元");
                                    System.out.println("待支付金额为：" + realSpend);
                                    System.out.println("正在为您跳转充值界面");
                                    Thread.sleep(2000);
                                    investMoney();
                                }
                            }
                            break;
                        //vip等级为1级
                        case 1:
                            System.out.println("您的vip等级为1级，可以享受95折优惠");
                            realSpend = spend * 0.95;//打折后的价格
                            while (true) {
                                if (customer.getBalance() >= realSpend) {
                                    System.out.println("您最终消费 " + realSpend + "元,我们还提供七天无理由退货哦~");
                                    //更新用户的消费金额
                                    customer.setConsume(customer.getConsume() + realSpend);
                                    System.out.println("您当前的会员等级为vip" + customer.vipLevel() + "，请继续努力！");
                                    break;
                                }else {
                                    Thread.sleep(500);
                                    System.out.println("账户余额不足，赶紧去充个十万八万的~");
                                    Thread.sleep(1000);
                                    System.out.println("您的账户余额为:" + customer.getBalance() + "元");
                                    System.out.println("待支付金额为：" + realSpend);
                                    System.out.println("正在为您跳转充值界面");
                                    Thread.sleep(2000);
                                    investMoney();
                                }
                            }
                            break;
                        //vip等级为2级
                        case 2:
                            System.out.println("您的vip等级为2级，可以享受9折优惠");
                            realSpend = spend * 0.9;
                            while (true) {
                                if (customer.getBalance() >= realSpend) {
                                    System.out.println("您最终消费 " + realSpend + "元,我们还提供七天无理由退货哦~");
                                    //更新用户的消费金额
                                    customer.setConsume(customer.getConsume() + realSpend);
                                    System.out.println("您当前的会员等级为vip" + customer.vipLevel() + "，请继续努力！");
                                    break;
                                }else {
                                    Thread.sleep(500);
                                    System.out.println("账户余额不足，赶紧去充个十万八万的~");
                                    Thread.sleep(1000);
                                    System.out.println("您的账户余额为:" + customer.getBalance() + "元");
                                    System.out.println("待支付金额为：" + realSpend);
                                    System.out.println("正在为您跳转充值界面");
                                    Thread.sleep(2000);
                                    investMoney();
                                }
                            }
                            break;
                        //vip等级为3级
                        case 3:
                            System.out.println("您的vip等级为3级，可以享受85折优惠");
                            realSpend = spend * 0.85;
                            while (true) {
                                if (customer.getBalance() >= realSpend) {
                                    System.out.println("您最终消费 " + realSpend + "元,我们还提供七天无理由退货哦~");
                                    //更新用户的消费金额
                                    customer.setConsume(customer.getConsume() + realSpend);
                                    System.out.println("您当前的会员等级为vip" + customer.vipLevel() + "，请继续努力！");
                                    break;
                                }else {
                                    Thread.sleep(500);
                                    System.out.println("账户余额不足，赶紧去充个十万八万的~");
                                    Thread.sleep(1000);
                                    System.out.println("您的账户余额为:" + customer.getBalance() + "元");
                                    System.out.println("待支付金额为：" + realSpend);
                                    System.out.println("正在为您跳转充值界面");
                                    Thread.sleep(2000);
                                    investMoney();
                                }
                            }
                            break;
                        //vip等级为4级
                        case 4:
                            System.out.println("您的vip等级为4级，可以享受8折优惠");
                            realSpend = spend * 0.8;
                            while (true) {
                                if (customer.getBalance() >= realSpend) {
                                    System.out.println("您最终消费 " + realSpend + "元,我们还提供七天无理由退货哦~");
                                    //更新用户的消费金额
                                    customer.setConsume(customer.getConsume() + realSpend);
                                    System.out.println("您当前的会员等级为vip" + customer.vipLevel() + "，请继续努力！");
                                    break;
                                }else {
                                    Thread.sleep(500);
                                    System.out.println("账户余额不足，赶紧去充个十万八万的~");
                                    Thread.sleep(1000);
                                    System.out.println("您的账户余额为:" + customer.getBalance() + "元");
                                    System.out.println("待支付金额为：" + realSpend);
                                    System.out.println("正在为您跳转充值界面");
                                    Thread.sleep(2000);
                                    investMoney();
                                }
                            }
                            break;
                    }
                    //将消费金额存入订单集合中
                    Order order = new Order();
                    putInOrder(realSpend,order,buyGoodsName);
                    //更新这个商品的库存
                    goods1.setStock(goods1.getStock() - buyGoodsNum);
                    //更新用户的余额
                    customer.setBalance(customer.getBalance() - realSpend);
                    //更新商家的余额
                    sellers.get(0).setBalance(realSpend);
                    temp = sellers.get(0).getBalance();
                    System.out.println("您的账户余额为:" + customer.getBalance() + "元");

                    System.out.println("这是您的订单号码：" + order.getOrderId() + "，请妥善保管，可凭借此号码退货");
                    break;
                }else{
                    System.out.println("商品库存不足，当前库存为" + goods1.getStock() + "，请重新操作");
                }
                break;
            }else {
                System.out.println("不存在" + buyGoodsName + "这个商品~");
            }
        }
    }

    //将订单信息存入订单集合
    public void putInOrder(double money,Order order,String name){
        int randomNumber = r.nextInt(100000) + 1000000;
        order.setOrderId(randomNumber);
        order.setMoney(money);
        order.setName(name);
        Store.orders.add(order);
    }

    //判断消费金额属于哪个vip等级
    public int vipLevel() {
        int level = 0;
        if(this.getConsume() >= 0 && this.getConsume() <= 1000){
            level = 0;
        }
        if (this.getConsume() > 1000 && this.getConsume() <= 2000) {
            level = 1;//vip等级为1级
        }else if(this.getConsume() > 2000 && this.getConsume() <= 5000){
            level = 2;//vip等级为2级
        }else if(this.getConsume() > 5000 && this.getConsume() <= 20000){
            level = 3;//vip等级为3级
        }else if(this.getConsume() > 20000){
            level = 4;//vip等级为4级
        }
        return level;
    }

    //充值服务
    public void investMoney(){
        System.out.println("请输入您要充值的金额：");
        //定义变量接受用户充值的金额
        int invest = sc.nextInt();
        //更新用户的余额
        this.setBalance(this.getBalance() + invest);
        System.out.println("您账户当前可用余额为：" + this.getBalance());
    }

    //判断用户要买的这个东西是否存在
    public Goods judgeExist(String name, ArrayList<Goods> goods){
        for (Goods good : goods) {
            if (good.getName().equals(name)){
                return good;
            }
        }
        return null;
    }

    public void showVip(){
        System.out.println("vip等级\t\t可享受折扣\t消费额");
        System.out.println("vip0\t\t无折扣\t\t0元");
        System.out.println("vip1\t\t9.5折\t\t1000元");
        System.out.println("vip2\t\t9.0折\t\t2000元");
        System.out.println("vip3\t\t8.5折\t\t5000元");
        System.out.println("vip4\t\t8.0折\t\t20000元");
    }

}
