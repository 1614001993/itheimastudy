package com.itheima.member;

import com.itheima.Store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.itheima.Store.saveGoodData;

public class Seller {
    private static Scanner sc = new Scanner(System.in);
    private static Random rd = new Random();
    private static Store store;

    // Seller属性：类别：
    private int type;
    // 姓名：
    private String userName;
    // 账户名：
    private String account;
    // 密码：
    private String passWord;
    // 余额：
    private double balance;
    // 电话：
    private String phoneNumber;

    public Seller() {
    }

    public Seller(int type, String userName, String account, String passWord, double balance, String phoneNumber) {
        this.type = type;
        this.userName = userName;
        this.account = account;
        this.passWord = passWord;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return type
     */
    public int getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Seller{type = " + type + ", userName = " + userName + ", account = " + account + ", passWord = " + passWord + ", balance = " + balance + ", phoneNumber = " + phoneNumber + "}";
    }

    // 添加商品
    public static void addGoods() {
        Goods good = new Goods();
        System.out.println("----------商家正在添加商品----------");
        //商品id为随机生成，如果集合中已经存在该id，则继续随机直到集合中没有存在该id为止。
        while (true) {
            int r=rd.nextInt(9001)+1000;
            if (getGoods(r) == null) {
                good.setId(r);
                break;
            }
        }
        System.out.println("请输入您的商品名：");
        String name = sc.next();
        good.setName(name);

        System.out.println("请输入您的商品价格(例如12.9)：");
        Double price = sc.nextDouble();
        good.setPrice(price);

        System.out.println("请输入商品库存：");
        int stock = sc.nextInt();
        good.setStock(stock);

        Store.goods.add(good);
        System.out.println("添加成功:您已成功添加了以下商品");
        getOneGoods(good);


        try {
            saveGoodData(good);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return;


    }

    //删除商品
    public static void removeGoods() {
        if (Store.goods.size() == 0) {
            System.out.println("当前没有商品列表为空，没有可以删除的商品");
            return;
        }

        showGoods();

        System.out.println("请输入要删除的商品id");
        int id = sc.nextInt();
        Goods temp = getGoods(id);
        //判断要修改的商品是否存在
        if (temp == null) {
            System.out.println("未找到该商品，请检查商品id是否正确");
            return;
        } else {
            System.out.println("您将要移除以下商品");
            // 展示当前商品
            getOneGoods(temp);
            System.out.println("请确实是否删除  1.确认 2.取消");
            String command = sc.next();
            switch (command){
                case "1":
                    //对商品进行移除
                    Store.goods.remove(temp);
                    System.out.println("该商品已成功删除");
                    return;
                case "2":
                    // 取消删除操作
                    System.out.println("已取消删除商品");
                    break;
                default:
                    System.out.println("代码有误，不用的眼睛可以捐给有需要的人");
                    break;
            }

        }
    }

    //修改商品
    public static void amendGoods() {
        if (Store.goods.size() == 0) {
            System.out.println("当前没有商品列表为空，没有可以修改的商品");
            return;
        }


        System.out.println("请输入您要修改的商品id");
        int id = sc.nextInt();
        Goods temp = getGoods(id);
        //判断要修改的商品是否存在
        if (temp == null) {
            System.out.println("请添加该商品或者检查商品id是否正确");
            return;
        } else {
            //先展示商品信息
            getOneGoods(temp);
            //修改
            System.out.println("请修改商品名(如果不需要修改当前信息直接按下回车即可)");
            sc.nextLine();
            String name = sc.nextLine();
            if (name != "") {
                temp.setName(name);
            }
            System.out.println("请修改商品价格");

            String priceStr = sc.nextLine();
            //对商品信息进行校验，不输入则不修改当前信息
            if (priceStr != "") {
                Double price = Double.parseDouble(priceStr);
                temp.setPrice(price);
            }
            System.out.println("请修改商品库存");
            String tempStock = sc.nextLine();
            if (tempStock != "") {
                int stock = Integer.parseInt(tempStock);
                temp.setStock(stock);
            }
            if (name == "" && priceStr == "" && priceStr == "") {
                System.out.println("没有输入相关属性，没有进行任何修改");
                return;
            }
            System.out.println("修改成功，修改后的商品信息如下");
            getOneGoods(temp);
            return;
        }
    }

    // 查看商品
    public static void showGoods() {
        System.out.println("商品ID\t\t商品名称\t\t商品单价\t\t商品库存");
        for (Goods good : Store.goods) {
            System.out.println(good.getId() + "\t\t" + good.getName() + "\t\t" + good.getPrice() + "\t\t\t" + good.getStock());
        }
    }

    //根据传入的id获取该商品  如果搜索到该商品，返回该商品，否则返回null
    public static Goods getGoods(int id) {
        for (int i = 0; i < Store.goods.size(); i++) {
            if (id == Store.goods.get(i).getId())
                return Store.goods.get(i);
        }
        return null;
    }

    //根据传入的商品名称获取该商品  如果搜索到该商品，返回该商品，否则返回null
    public static Goods getGoods(String goodsName) {
        for (int i = 0; i < Store.goods.size(); i++) {
            if (Store.goods.get(i).getName().equals(goodsName))
                return Store.goods.get(i);
        }
        return null;
    }

    //展示当前操作的商品信息  对当前商品进行操作时，先展示信息（例如删除前，修改前）
    public static void getOneGoods(Goods goods) {
        System.out.println("商品id\t\t商品名称\t\t商品单价\t\t商品库存");
        System.out.println(goods.getId() + "\t\t" + goods.getName() + "\t\t" + goods.getPrice() + "\t\t" + goods.getStock());
    }

    //对商品进行排序（价格由低到高或者由高到低）
    public static void sortPrice(ArrayList<Goods> goodlist) {
        while (true) {
            System.out.println("1.按价格由低到高排序    2.按价格由高到低排序  3.按库存由低到高排序 4.按库存由高到低排序  5.返回上一级");
            System.out.println("请选择序号：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sort(goodlist, choice);
                    //展示
                    Store.showGoods();
                    break;
                case 2:
                    sort(goodlist, choice);
                    //展示
                    Store.showGoods();
                    break;
                case 3:
                    sort(goodlist, choice);
                    //展示
                    Store.showGoods();
                    break;
                case 4:
                    sort(goodlist, choice);
                    //展示
                    Store.showGoods();
                    break;
                case 5:
                    return;

                    //结束方法
                default:
                    System.out.println("暂不支持该排序，请重新选择！");
                    break;
            }
        }
    }

    //排序的操作步骤
    public static void sort(ArrayList<Goods> goodlist, int category) {
        //冒泡排序
        //外层for循环决定冒几次泡
        for (int i = 0; i < goodlist.size() - 1; i++) {
            //内存循环：比较相邻的两个元素
            for (int j = 0; j < goodlist.size() - 1 - i; j++) {
                // j  j+1
                Goods mj = goodlist.get(j);
                Goods mg1 = goodlist.get(j + 1);
                //从低到高交换
                if (category == 1) {
                    //按照点击率排序
                    if (mj.getPrice() > mg1.getPrice()) {
                        //交换
                        goodlist.set(j, mg1);
                        goodlist.set(j + 1, mj);
                    }
                } else if (category == 2) {
                    //按照价格从高到低排序
                    if (mj.getPrice() < mg1.getPrice()) {
                        //交换
                        goodlist.set(j, mg1);
                        goodlist.set(j + 1, mj);
                    }
                }
                //库存由低到高
                else if (category == 3) {
                    if (mj.getStock() > mg1.getStock()) {
                        //交换
                        goodlist.set(j, mg1);
                        goodlist.set(j + 1, mj);
                    }
                } else {
                    if (mj.getStock() < mg1.getStock()) {
                        //交换
                        goodlist.set(j, mg1);
                        goodlist.set(j + 1, mj);
                    }
                }
            }
        }
    }


}
