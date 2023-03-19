import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    // 1、分析并完成以下需求:
    //
    //         1.键盘录入班级人数
    // 2.根据录入的班级人数创建数组
    // 3.利用随机数产生0-100的成绩(包含0和100)
    // 4.要求:
    //         (1)打印该班级的不及格人数<60
    //         (2)打印该班级的平均分
    //         (3)演示格式如下:
    // 请输入班级人数:
    // 键盘录入:100
    // 控制台输出:
    // 不及格人数:19
    // 班级平均分:87
    public static void main(String[] args) {
        getAverage();
    }

    public static void getAverage() {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("请输入班级的人数：");
        int n = scanner.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < people.length; i++) {
            int score=rd.nextInt(101);
            people[i]=score;
        }
        int count=0;
        double sum=0;
        double ave=0;
        for (int i = 0; i < people.length; i++) {
            System.out.print(people[i]+" ");
            sum+=people[i];
            if(people[i]<60){
                count++;
            }
        }
        ave=sum/n;
        System.out.println("班级的平均分为"+ave);
        System.out.println("班级不及格人数为"+count);
    }
}
