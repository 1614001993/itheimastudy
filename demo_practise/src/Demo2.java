import java.util.Random;

public class Demo2 {

    //验证码,返回指定位数的验证码，每位可以为数字字母（大小写）字符
    public static void main(String[] args) {
        Demo1(6);
    }

    //n为验证码的位数
    public static void Demo1(int n) {
        Random rd = new Random();
        String aaa = "";

        for (int i = 0; i < n; i++) {
            int num = rd.nextInt(2);
            switch (num) {
                case 0:
                    //数字0~9
                    aaa += rd.nextInt(10);
                    break;
                case 1:
                    //如果随机数为1，则表示是大小写字母，则继续随机一个数来选择是大写还是小写
                    int num1 = rd.nextInt(2);
                    switch (num1) {
                        case 0:
                            aaa += (char) (rd.nextInt(25) + 66);
                            break;
                        case 1:
                            aaa += (char) (rd.nextInt(26) + 97);
                            break;
                    }
            }

        }
        System.out.println("验证码为"+aaa);
    }
}
