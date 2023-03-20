public class Demo8 {
    public static void main(String[] args) {
        Demo1();
    }

    public static void Demo1() {
        int count = 0;
        for (int i = 10000; i > 1000; i--) {
            if (i % 10 + (i / 100) % 10 == (i % 100) / 10 + i / 1000) {
                System.out.print(i + " ");
                count++;

                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.print("\n" + "总共有" + count + "个数");
    }
}
