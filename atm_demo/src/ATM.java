import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {


    private ArrayList<Account> users = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    //测试用户

    // public void baseUser() {
    //     Account use = new Account("张三", 77777777, "123456", '女', 4000.0, 4000, 10000);
    //     Account use1 = new Account("李四", 66666666, "123456", '男', 0.0, 4000, 10000);
    //     Account use2 = new Account("王麻子", 44444444, "123456", '男', 5000.0, 4000, 10000);
    //     users.add(use);
    //     users.add(use1);
    //     users.add(use2);
    // }

    //欢迎页
    public void helloUser() {
        helloChoss();
    }
    //欢迎页 选择操作
    private void helloChoss() {
        System.out.println("======欢迎使用ATM系统======");
        System.out.println("请选择您要进行的操作：");
        while (true) {
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            int n = sc.nextInt();
            if (n == 1) {
                chooses();
                break;
            } else if (n == 2) {
                regist();
                break;
            } else {
                System.out.println("======欢迎使用ATM系统======");
                System.out.println("代号错误，请重新选择");
            }
        }
    }

    //登录操作
    private void chooses() {
        if (users.size() == 0) {
            System.out.println("信息为空，请先开户");
            //调用开户
            regist();
        } else {
            //调用登录
            login();
        }
    }

    //登录操作
    private void login() {
        int loginSuccess = 0;
        while (true) {
            System.out.println("请输入账号：");
            int userId = sc.nextInt();
            Boolean result = ifExist(userId);
            if (!result) {
                System.out.println("请输入密码：");
                String pass = sc.next();
                Boolean passResult = passIsTrue(userId, pass);
                if (passResult) {
                    loginSuccess = userId;
                    break;
                }
            } else {
                System.out.println("用户名不存在，请重新输入或者检查用户名是否正确");
            }
        }
        Account person = getAccountById(loginSuccess);
        System.out.println(person.getName() + "，您已经成功登陆进入系统，您的卡号为：" + person.getId());
        managePage(person);
    }

    //判断用户名与密码是否匹配
    private Boolean passIsTrue(int userId, String pass) {
        int index = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userId) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (pass.equals(users.get(index).getPass())) {
                return true;
            } else {
                if (i == 2) {
                    System.out.println("密码已经输错三次,请取回您的卡片");
                    helloChoss();
                    break;
                } else {
                    System.out.println("密码输入错误" + (i + 1) + "次，请重新输入");
                    pass = sc.next();
                }
            }
        }
        return false;
    }

    //开户操作
    private void regist() {
        Random rd = new Random();
        System.out.println("您即将开户");
        System.out.println("======系统开户操作======");
        System.out.println("请输入您的账户名称");
        String name = sc.next();
        System.out.println("请输入您的性别");
        char sex = 0;
        while (true) {
            String sex0 = sc.next();
            char sex1 = sex0.charAt(0);
            if (sex1 == '男'||sex1 == '女') {
                sex = sex1;
                break;
            }
            else {
                System.out.println("您输入的性别有误，请重新输入");
            }
        }
        System.out.println("请输入您的账户密码");
        String pass = sc.next();
        while (true) {
            System.out.println("请再次输入您的密码");
            String pass2 = sc.next();
            if (pass2.equals(pass)) {
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }
        double balance = 0;
        System.out.println("请输入您每次的取现的最大额度");
        int timeLimit = sc.nextInt();
        //日限额10000元；
        double dayLimit = 10000.00;
        // 账户id为8位数
        int id = getId();
        Account use = new Account(name, id, pass, sex, balance, timeLimit, dayLimit);
        users.add(use);
        System.out.println("恭喜您," + name + "开户成功," + "您的卡号为：" + id);
        show();
        helloChoss();
    }

    //随机生成账户id
    private int getId() {
        Random rd = new Random();
        Boolean ok = false;
        int ids;
        System.out.println(123);
        while (true) {
            int idRand = rd.nextInt((100000000 - 10000000)) + 10000000;
            Boolean result = ifExist(idRand);
            if (result) {
                ids = idRand;
                break;
            }
        }
        return ids;
    }

    //判断id是否存在  存在返回false，不存在返回true
    private Boolean ifExist(int id) {
        Boolean result = true;
        for (int i = 0; i < users.size(); i++) {
            if (id == users.get(i).getId()) {
                result = false;
            }
        }
        if (result) {
            return true;
        }
        return false;
    }

    //根据id返回account对像
    private Account getAccountById(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (id == users.get(i).getId()) {
                return users.get(i);
            }
        }
        return null;
    }

    //登录成功后续操作
    private void managePage(Account acc) {
        System.out.println("======账户操作======");
        System.out.println("1.查询账户");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转帐");
        System.out.println("5.密码修改");
        System.out.println("6.退出");
        System.out.println("7.注销当前账户");
        System.out.println("请选择：");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                showArrList(acc);
                break;
            case 2:
                setMoney(acc);
                break;
            case 3:
                getMoney(acc);
                break;
            case 4:
                sendMoney(acc);
                break;
            case 5:
                changePass(acc);
                break;
            case 6:
                helloUser();
                break;
            case 7:
                remove(acc);
                break;

            default:
                System.out.println("选择的信息有误，请重新登录");
        }
    }


    //展示当前用户信息
    private void showArrList(Account acc) {
        System.out.println("======账户信息======");
        System.out.println("卡号：" + acc.getId());
        System.out.println("开户人：" + acc.getName());
        System.out.println("性别：" + acc.getSex());
        System.out.println("余额：" + acc.getBalance());
        System.out.println("每次限额：" + acc.getTimeLimit());
        System.out.println("按任意键返回");
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        if(n!=null){
            managePage(acc);
        }

    }

    //存款取款
    private void getMoney(Account acc) {
        System.out.println("请输入取款金额");
        while (true) {
            Double n = sc.nextDouble();
            if (n > acc.getBalance()) {
                System.out.println("您的取款金额大于余额，您的余额还有" + acc.getBalance() + "元,请重新输入");
            } else {
                if (n > acc.getTimeLimit()) {
                    System.out.println("您的单次取款金额需要少于" + acc.getTimeLimit() + "元，请重新输入");
                } else {
                    double money = acc.getBalance() - n;
                    acc.setBalance(money);
                    System.out.println("取款成功，您的账户余额为" + acc.getBalance());
                    managePage(acc);
                    break;
                }
            }

        }
    }

    private void setMoney(Account acc) {
        System.out.println("请输入您的存款金额");
        Double n = sc.nextDouble();
        acc.setBalance(acc.getBalance() + n);
        System.out.println("您存入了" + n + "元，您的账户当前余额为" + acc.getBalance());
        managePage(acc);
    }

    //转帐
    private void sendMoney(Account acc) {
        System.out.println(users.size());
        if (users.size() <= 1) {
            System.out.println("系统中不存在其他账户");
        } else {
            if (acc.getBalance() > 0) {
                System.out.println("请输入您要转账的账户：");
                while (true) {
                    int n = sc.nextInt();
                    Boolean result = ifExist(n);
                    if (!result) {
                        Account sendPerson = getAccountById(n);
                        String name = sendPerson.getName();
                        System.out.println("请补全收款人的姓名");
                        String rename = name.replace(name.charAt(1), '*');
                        System.out.println(rename);
                        while (true) {
                            String na = sc.next();
                            char str = na.charAt(0);
                            if (name.charAt(1) == str) {
                                System.out.println("确认成功");
                                System.out.println("请输入转账金额：");
                                while (true) {
                                    double sendMoney = sc.nextDouble();
                                    if (sendMoney > acc.getBalance()) {
                                        System.out.println("余额不足，转帐失败，请核对金额后重新输入");
                                    } else {
                                        acc.setBalance(acc.getBalance() - sendMoney);
                                        sendPerson.setBalance(sendPerson.getBalance() + sendMoney);
                                        System.out.println("转帐成功");
                                        System.out.println("您的余额还有" + acc.getBalance());
                                        System.out.println("对方的余额为" + sendPerson.getBalance());
                                        managePage(acc);
                                        break;
                                    }
                                }
                                break;
                            } else {
                                System.out.println("信息不匹配，请重新输入");
                            }
                        }
                        break;
                    } else {
                        System.out.println("账户不存在，请重新输入");
                    }

                }
            }

        }
    }

    //修改密码
    private void changePass(Account acc) {
        System.out.println("请输入当前密码：");
        for (int i = 0; i < 3; i++) {
            String pass = sc.next();
            if (pass.equals(acc.getPass())) {
                System.out.println("验证通过，请输入您的新密码");
                String newPass1 = sc.next();
                System.out.println("请再次输入新密码：");
                while (true) {
                    String newPass2 = sc.next();
                    if (newPass2.equals(newPass1)) {
                        acc.setPass(newPass2);
                        System.out.println("密码修改成功");
                        helloChoss();
                        break;
                    } else {
                        System.out.println("两次密码不一致，请重新输入");
                    }

                }
                break;
            } else {
                if (i == 2) {
                    System.out.println("三次密码错误，已退出");
                    break;
                }
                System.out.println("旧密码错误，请重新输入（还有" + (2 - i) + "次）：");
            }

        }
    }

    //销户
    private void remove(Account acc) {
        System.out.println("您确认要销户吗？(继续请输入0，取消请输入1)");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                users.remove(acc);
                helloChoss();
                break;
            } else if (n == 1) {
                managePage(acc);
            } else {
                System.out.println("代号不匹配，请重新输入");
            }
        }
    }

    // 展示所有用户
    private void show(){
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
}



