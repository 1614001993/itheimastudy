import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        double ave = getAverage();
        System.out.println("平均分为" + ave);
    }

    public static double getAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入评委的人数：");
        int n = scanner.nextInt();
        double[] people = new double[n];
        double sum = 0;
        for (int i = 0; i < people.length; i++) {
            System.out.print("请第" + (i + 1) + "号评委打分：");
            double score = scanner.nextDouble();
            people[i] = score;
            if (score < 0 || score > 100) {
                System.out.println("请重新打分");
                i--;
                continue;
            }
        }
        double max = people[0];
        double min = people[0];


        for (int i = 0; i < people.length; i++) {
            if (people[i] > max) {
                max = people[i];

            }
            if (people[i] < min) {
                min = people[i];
            }
            sum+=people[i];

        }
        System.out.println("去掉一个最高分"+max+"，去掉一个最低分"+min);
        double average = (sum - max - min) / (n - 2);
        return average;
    }
}
