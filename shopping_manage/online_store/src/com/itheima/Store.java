package com.itheima;

import com.itheima.member.Customer;
import com.itheima.member.Goods;
import com.itheima.member.Order;
import com.itheima.member.Seller;

import java.awt.color.ICC_ColorSpace;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

import static com.itheima.member.Seller.showGoods;

public class Store {
    private static Scanner sc = new Scanner(System.in);
    private static Random r = new Random();
    private static ArrayList<Seller> sellers = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Goods> goods = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();
    public static ArrayList<Goods> sp = new ArrayList<>();

    // 系统开始界面
    public static void start() throws IOException, InterruptedException {
        // 默认值测试用
//        Customer customer = new Customer(1, "kehu", "kehu", "123", 1000, 0, 0, "13111111111");
//        Seller seller = new Seller(0, "shangjia", "shangjia", "123", 1000, "13111111111");
////        Goods good = new Goods(1, "qwe", 12.99, 1001);
////        goods.add(good);
//        sellers.add(seller);
//        customers.add(customer);

        dataGoodsInList();

        dataCustomerInList();
        dataSellerInList();

        System.out.println("==========欢迎光临在线交易商城==========");
        while (true) {
            System.out.println("------------请选择您的操作------------");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");
            String command = sc.next();
            switch (command) {
                case "1":
                    // 登录
                    login();
                    break;
                case "2":
                    // 注册
                    register();
                    break;
                case "3":
                    // 退出系统
                    return;
                default:
                    System.out.println("指令有误，不用的眼睛可以捐给有需要的人");
                    break;
            }
        }
    }

    /**
     * 注册模块从此开始
     */
    // 注册界面
    private static void register() {
        System.out.println("----------您正在进行注册操作----------");
        while (true) {
            System.out.println("请输入您的角色：");
            System.out.println("0.代表商家");
            System.out.println("1.代表顾客");
            System.out.println("2.退出注册");
            String type = sc.next();
            switch (type) {
                case "0":
                    // 注册商家
                    registerUsers(type);
                    return;
                case "1":
                    // 注册客户
                    registerUsers(type);
                    return;
                case "2":
                    return;
                default:
                    System.out.println("指令有误，不用的眼睛可以捐给有需要的人");
                    break;
            }
        }

    }

    // 注册
    private static void registerUsers(String choose) {

        if ("1".equals(choose)) {
            Customer cus = new Customer();
            System.out.println("----------顾客正在进行注册操作----------");
            System.out.println("请输入您的用户名：");
            String account = sc.next();
            cus.setAccount(account);
            String password;

            while (true) {
                System.out.println("请输入您的密码：");
                password = sc.next();
                String reg = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$";
                if (!password.matches(reg)) {
                    System.out.println("密码格式错误，需要6~15位组成，并且必须包含字母和数字");
                    continue;
                }
                if (!checkPassword(password)) {
                    System.out.println("两次密码不一致，请重新设置密码");
                } else {
                    cus.setPassWord(password);
                    break;
                }
            }


            System.out.println("请输入您的姓名：");
            String name = sc.next();
            cus.setUserName(name);

            String phone;
            while (true) {
                System.out.println("请输入您的电话：");
                phone = sc.next();
                cus.setPhoneNumber(phone);
                String phoneReg = "1(35|55|30|13|33|)\\d{8}";
                if (!phone.matches(phoneReg)) {
                    System.out.println("手机号码必须为11位数，必须以135,155,130,137,133开头");
                } else {
                    break;
                }
            }

            // 存入本地
            try {
                saveCustomerData(account, password, account, phone);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            customers.add(cus);
            System.out.println("注册成功");

            return;
        } else {
            Seller seller = new Seller();
            System.out.println("----------商家正在进行注册操作----------");
            seller.setType(0);
            System.out.println("请输入您的用户名：");
            String account = sc.next();
            seller.setAccount(account);

            String password;

            while (true) {
                System.out.println("请输入您的密码：");
                password = sc.next();
                String reg = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$";
                if (!password.matches(reg)) {
                    System.out.println("密码格式错误，需要6~15位组成，并且必须包含字母和数字");
                    continue;
                }
                if (!checkPassword(password)) {
                    System.out.println("两次密码不一致，请重新设置密码");
                } else {
                    seller.setPassWord(password);
                    break;
                }
            }
            System.out.println("请输入您的姓名：");
            String name = sc.next();
            seller.setUserName(name);

            String phone;
            while (true) {
                System.out.println("请输入您的电话：");
                phone = sc.next();
                seller.setPhoneNumber(phone);
                String phoneReg = "1(35|55|30|13|33|)\\d{8}";
                if (!phone.matches(phoneReg)) {
                    System.out.println("手机号码必须为11位数，必须以135,155,130,137,133开头");
                } else {
                    break;
                }
            }

            // 存入本地
            try {
                saveSellerData(account, password, account, phone);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            sellers.add(seller);
            System.out.println("注册成功");
            return;
        }
    }

    // 密码校验
    private static Boolean checkPassword(String password) {
        System.out.println("请再次输入密码");
        String passwordAgain = sc.next();
        if (password.equals(passwordAgain)) {
            return true;
        }
        return false;
    }

    /**
     * 注册模块到此结束
     */

    // 登录
    private static void login() throws InterruptedException {
        System.out.println("----------您正在进行登录操作----------");
        String account;
        String password;
        while (true) {
            System.out.println("请输入您的角色：");
            System.out.println("0.代表商家");
            System.out.println("1.代表顾客");
            boolean flag = false; // 是否成功登录
            String choose = sc.next();
            // 1.用户
            if ("1".equals(choose)) {
                if (customers.size() == 0) {
                    System.out.println("系统中没有顾客账户，请您先注册");
                    System.out.println("正在跳转注册界面");

                    jingDuTiao();
                    register(); // 没有账户跳转注册界面
                    return;
                }
                System.out.println("请输入您的用户名：");
                account = sc.next();
                System.out.println("请输入您的密码：");
                password = sc.next();
                for (Customer customer : customers) {
                    if (account.equals(customer.getAccount()) && password.equals(customer.getPassWord())) {
                        System.out.println("登录成功");
                        flag = true;
                        // 用户购买
                        shopping(customer);
                        break;
                    }
                }
                if (flag) {
                    return;
                }
                System.out.println("用户名或密码错误，请重新操作");
                // 0.商家
            } else if ("0".equals(choose)) {
                if (sellers.size() == 0) {
                    System.out.println("系统中没有商家账户，请您先注册");
                    System.out.println("正在跳转注册界面");

                    jingDuTiao();
                    register(); // 没有账户跳转注册界面
                    return;
                }
                System.out.println("请输入您的用户名：");
                account = sc.next();
                System.out.println("请输入您的密码：");
                password = sc.next();
                for (Seller seller : sellers) {
                    if (account.equals(seller.getAccount()) && password.equals(seller.getPassWord())) {
                        System.out.println("登录成功");
                        flag = true;
                        // 商家-商品管理界面
                        goodsManagement(seller);
                        break;
                    }
                }
                if (flag) {
                    return;
                }
                System.out.println("用户名或密码错误，请重新操作");
            } else {
                System.out.println("看不到只有0和1嘛？？？是不是找事？");
            }
        }
    }

    // 商家商品管理界面
    public static void goodsManagement(Seller seller) {
        while (true) {
            System.out.println("----------商品管理页面----------");
            System.out.println("1.添加商品");
            System.out.println("2.查看商品");
            System.out.println("3.修改商品");
            System.out.println("4.删除商品");
            System.out.println("5.搜索商品");
            System.out.println("6.历史订单");
            System.out.println("7.退出登录");
            String command = sc.next();
            switch (command) {
                case "1":
                    // 添加商品
                    seller.addGoods();
                    break;
                case "2":
                    // 查看商品
                    seller.showGoods();
                    break;
                case "3":
                    seller.amendGoods();
                    // 修改商品
                    break;
                case "4":
                    seller.removeGoods();
                    // 删除商品
                    break;
                case "5":
                    searchGoods();
                    // 搜索商品
                    break;
                case "6":
                    showHistoryOrders();
                    break;
                case "7":
                    // 退出登录
                    return;
                default:
                    System.out.println("代码有误，不用的眼睛可以捐给有需要的人");
                    break;
            }
        }
    }

    // 用户购买商品界面
    private static void shopping(Customer customer) throws InterruptedException {
        if (goods.size() == 0) { // 没有商品
            System.out.println("商城暂无商品，请联系商家先添加商品，再购买商品！");
            login();
        } else {
            while (true) {
                System.out.println("----------购买商品页面----------");
                System.out.println("1.查看商品");
                System.out.println("2.购买商品");
                System.out.println("3.余额查询");
                System.out.println("4.余额充值");
                System.out.println("5.俺要退货");
                System.out.println("6.会员等级");
                System.out.println("7.是抽奖哦");
                System.out.println("8.退出登录");
                String command = sc.next();
                switch (command) {
                    case "1":
                        // 查看商品
                        Seller.showGoods();
                        break;
                    case "2":
                        // 购买商品
                        customer.buy(goods, customer, sellers, orders);
                        break;
                    case "3":
                        // 余额查询
                        System.out.println("您账户当前可用余额为" + customer.getBalance());
                        break;
                    case "4":
                        // 余额充值
                        customer.investMoney();
                        break;
                    case "5":
                        // 退货
                        returnGoods(orders, customer, sellers.get(0));
                        break;
                    case "6":
                        // 展示会员等级
                        customer.showVip();
                        System.out.println();
                        System.out.println("您当前的会员等级为vip" + customer.vipLevel());
                        break;
                    case "7":
                        // 抽奖
                        drawPrizeWithMoney(customer);
                        break;

                    case "8":
                        // 退出系统
                        return;
                    default:
                        System.out.println("指令有误，不用的眼睛可以捐给有需要的人");
                        break;
                }

            }
        }
    }

    //用户不满意退货
    public static void returnGoods(ArrayList<Order> orders, Customer customer, Seller seller) throws InterruptedException {
        if (orders.size() == 0) {
            System.out.println("开玩笑，我们商城根本没有开张过，退**呢");
            return;
        }
        System.out.println("抱歉，这次没能让您满意~");
        Thread.sleep(500);
        System.out.println("请输入您的订单号码：");
        int orderNumber = sc.nextInt();
        shengLueHao();
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderId() == orderNumber) {
                System.out.println("感谢您的耐心等待");
                shengLueHao();
                System.out.println("感谢您的耐心等待");
                shengLueHao();
                System.out.println("这是您的退款：" + order.getMoney() + "元");
                //退款后更新用户的账户余额
                customer.setBalance(customer.getBalance() + order.getMoney());
                //退款后更新商家的账户余额
                seller.setBalance(seller.getBalance() - order.getMoney());
                //退款后更新用户消费金额
                customer.setConsume(customer.getConsume() - order.getMoney());
                //删除订单信息
                orders.remove(i);
                return;
            }
        }
        System.out.println("不存在这个订单号码，你是不是想骗我钱~");
    }

    //存入本地方法
    public static void saveCustomerData(String username, String password, String name, String phone) throws IOException, IOException {
        FileOutputStream fos = new FileOutputStream("online_store\\src\\com\\itheima\\InfoTxt\\CustomerInfo.txt", true);
        // FileInputStream fis = new FileInputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        osw.write("username=" + username + "\t");
        osw.write("password=" + password + "\t");
        osw.write("name=" + name + "\t");
        osw.write("phone=" + phone + "\t");
        osw.write("\n");
        osw.close();
    }

    public static void saveSellerData(String username, String password, String name, String phone) throws IOException, IOException {
        FileOutputStream fos = new FileOutputStream("online_store\\src\\com\\itheima\\InfoTxt\\SellerInfo.txt", true);
        // FileInputStream fis = new FileInputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        osw.write("username=" + username + "\t");
        osw.write("password=" + password + "\t");
        osw.write("name=" + name + "\t");
        osw.write("phone=" + phone + "\t");
        osw.write("\n");
        osw.close();
    }

    // 将商品信息保存到本地
    public static void saveGoodData(Goods good) throws IOException, IOException {
        FileOutputStream fos = new FileOutputStream("online_store\\src\\com\\itheima\\InfoTxt\\goodsInfo.txt", true);
        // FileInputStream fis = new FileInputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        osw.write("goodId=" + good.getId() + "\t");
        osw.write("goodName=" + good.getName() + "\t");
        osw.write("goodPrice=" + good.getPrice() + "\t");
        osw.write("goodStock=" + good.getStock() + "\t");
        osw.write("\n");
        osw.close();
    }

    // 将本地文件中的商家，信息录入集合
    public static void dataCustomerInList() throws IOException {
        // 获取文件输入字节流
        FileInputStream customerFis = new FileInputStream("online_store//src//com//itheima//InfoTxt//CustomerInfo.txt");
        // 将字节流转化为缓冲字符流
        BufferedReader customerBr = new BufferedReader(new InputStreamReader(customerFis));

        // FileInputStream sellerFis = new FileInputStream("online_store//src//com//itheima//InfoTxt//SellerInfo.txt");
        // BufferedReader sellerBr = new BufferedReader(new InputStreamReader(sellerFis));

        String customerLine;
        while ((customerLine = customerBr.readLine()) != null) {
            // 参数"\s+"表示使用一个或多个空格作为分隔符来拆分字符串line。
            String[] parts = customerLine.split("\\s+");
            //                      按照=分割   返回值是一个数组
            String username = parts[0].split("=")[1];
            String password = parts[1].split("=")[1];
            String account = parts[2].split("=")[1];
            String phone = parts[3].split("=")[1];
            Customer customer = new Customer(1, username, account, password, 0.0, 0.0, 0, phone);
            customers.add(customer);
        }
        customerBr.close();
        // String sellerLine;
        // while ((sellerLine = sellerBr.readLine()) != null){
        //     String[] parts1 = sellerLine.split("\\s+");
        //                          按照=分割   返回值是一个数组
        // String username = parts1[0].split("=")[1];
        // String password = parts1[1].split("=")[1];
        // String account = parts1[2].split("=")[1];
        // String phone = parts1[3].split("=")[1];
        // Seller seller = new Seller(0,username,account,password,0.0,phone);
        // sellers.add(seller);
        // }
        // sellerBr.close();

        // System.out.println(customers.get(0).getUserName());


    }

    public static void dataSellerInList() throws IOException {
        FileInputStream fis = new FileInputStream("online_store\\src\\com\\itheima\\InfoTxt\\SellerInfo.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\s+");

            String username = parts[0].split("=")[1];
            String password = parts[1].split("=")[1];
            String account = parts[2].split("=")[1];
            String phone = parts[3].split("=")[1];
            Seller seller = new Seller(0, username, account, password, 0.0, phone);
            sellers.add(seller);
        }
        br.close();
    }

    public static void dataGoodsInList() throws IOException {
        FileInputStream fis = new FileInputStream("online_store\\src\\com\\itheima\\InfoTxt\\goodsInfo.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\s+");
            String id = parts[0].split("=")[1];
            String name = parts[1].split("=")[1];
            String price = parts[2].split("=")[1];
            String stock = parts[3].split("=")[1];

            int goodId = Integer.parseInt(id);
            int goodStock = Integer.parseInt(stock);
            double goodPrice = Double.parseDouble(price);
            Goods good = new Goods(goodId, name, goodPrice, goodStock);
            goods.add(good);
        }
        br.close();
    }

    // 进度条的方法
    private static void jingDuTiao() {
        char incomplete = '░'; // U+2591 Unicode Character 表示还没有完成的部分
        char complete = '█'; // U+2588 Unicode Character 表示已经完成的部分

        int total = 100;

        StringBuilder stringBuilder = new StringBuilder();
        Stream.generate(() -> incomplete).limit(total).forEach(stringBuilder::append);

        for (int i = 0; i < total; i++) {
            stringBuilder.replace(i, i + 1, String.valueOf(complete));
            String progressBar = "\r" + stringBuilder;
            String percent = " " + (i + 1) + "%";
            System.out.print(progressBar + percent);
            //模拟进度越接近结束越慢
            try {
                Thread.sleep(i * 1L);
            } catch (InterruptedException ignored) {

            }
        }
        System.out.println();

    }

    // 省略号
    private static void shengLueHao() throws InterruptedException {
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        System.out.println();
    }

    /*
     * 模糊查询模块由此开始，在需要进行模糊查询的地方调用searchGoods()方法即可
     * */
    /*搜索商品*/

    public static void searchGoods() {
        sc.nextLine();
        System.out.println("请输入查询关键字（可为空，按回车确认）");
        String name = sc.nextLine();

        System.out.println("您输入的条件为");
        if (name != "") {
            System.out.println("关键字：" + name);
        } else {
            System.out.println("条件为空");
        }
        System.out.println("1.搜索  2.返回上一级");
        while (true) {
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("查询成功");
                    ArrayList<Goods> sp = souSuo(name);
                    if (sp != null) {
                        Seller.sortPrice(sp);

                    }
//                    break;
                case 2:
                    return;
                default:
                    System.out.println("输入的序号有误，请重新输入");
            }
        }

    }

    // 模糊搜索，搜索主方法
    private static ArrayList<Goods> souSuo(String name) {
        Boolean flag = false;
        sp.clear();
        for (int i = 0; i < Store.goods.size(); i++) {
            if (Store.goods.get(i).getName().contains(name)) {
                sp.add(Store.goods.get(i));
                flag = true;
            }
        }
        //搜索完成进行展示
        showGoods();
        if (!flag) {
            System.out.println("暂无此商品");
            return null;
        }
        return sp;
    }

    //对展示商品方法进行重写
    public static void showGoods() {
        System.out.println("商品ID\t\t商品名称\t\t商品单价\t\t商品库存");
        for (Goods good : sp) {
            System.out.println(good.getId() + "\t\t" + good.getName() + "\t\t" + +good.getPrice() + "\t\t\t" + good.getStock());
        }
    }

    /*
     * 模糊查询方法到此结束
     *
     * */

    //花钱抽奖
    private static void drawPrizeWithMoney(Customer customer) {
        if (customer.getBalance() <= 100) {
            System.out.println("您的账户余额为:" + customer.getBalance() + "元");
            System.out.println("抽奖100元一次，没钱你玩****？");
            // 余额充值
            customer.investMoney();
        } else {
            System.out.println("您的账户余额为:" + customer.getBalance() + "元");
            String[] prize = {"抱枕", "笔记本", "散热器", "优盘", "鼠标", "苹果", "很抱歉", "很抱歉", "很抱歉", "很抱歉", "很抱歉", "很抱歉", "很抱歉", "很抱歉", "很抱歉", "很抱歉", "很抱歉", "下次一定", "下次一定", "下次一定", "下次一定", "下次一定", "下次一定", "下次一定", "下次一定", "下次一定", "下次一定", "下次一定",};
            while (true) {
                System.out.println("老子来试试水~");
                System.out.println("走过路过不要错过，抽奖100元一次，百分百中奖，有笔记本、(苹果)（是你想的那个苹果o~~）等大奖，瞧一瞧看一看了");
                System.out.println("你确定要抽奖吗Y/N");
                String choose = sc.next();
                switch (choose) {
                    case "Y":
                        if (customer.getBalance() <= 100) {
                            System.out.println("您的账户余额为:" + customer.getBalance() + "元");
                            System.out.println("抽奖100元一次，没钱你玩****？");
                            // 余额充值
                            customer.investMoney();
                        } else {
                            int index = r.nextInt(prize.length);
                            System.out.println("运气爆棚，您抽到\"" + prize[index] + "\"一个");
                            System.out.println();
                        }
                        break;
                    case "N":
                        System.out.println("不抽赶紧爬~");
                        System.out.println();
                        return;
                    default:
                        System.out.println("你是不是瞎，不会看选项吗");
                        System.out.println();
                        break;
                }
                customer.setBalance(customer.getBalance() - 100);

            }
        }
    }

    //展示历史订单
    public static void showHistoryOrders() {
        if (orders.size() == 0) {
            System.out.println("没开张呢别查了，快去买东西");
            return;
        }
        System.out.println("订单编号     商品名称      订单总价");
        for (Order order : orders) {
            System.out.print(order.getOrderId() + "    ");
            System.out.print(order.getName() + "      ");
            System.out.print(order.getMoney());
            System.out.println();

        }
    }

}
