import java.util.Random;

public class Demo7 {
    public static void main(String[] args) {
        Demo1();
    }
    public static void Demo1() {
        for (int i = 1; i < 101; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
