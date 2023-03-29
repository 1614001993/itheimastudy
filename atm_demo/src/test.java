import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] sjifd={1,3,5};
        Demo1(sjifd);
        helloWorld();
    }
    public static void helloWorld(){
        System.out.println("调用非静态方法");
    }
    public static void Demo1(int[] arr){
            Random rd = new Random();
            Boolean ok = false;
            while (true) {
                // int id=rd.nextInt((100000000-10000000) )+10000000;
                int id = rd.nextInt(6);
                for (int i = 0; i <arr.length ; i++) {
                    if (id == arr[i]) {
                        ok = true;
                        break;
                    } else {
                        ok = false;
                    }
                }
                if (!ok) {
                    System.out.println(id);
                    break;
                }
            }
        }
}
