public class Demo4 {
    public static void main(String[] args) {
            int newNum=numPass(1983);
        System.out.println(newNum);
    }
    public static int numPass(int num){
        int newGe=(num%10+5)%10;
        int newShi=(num/10%10+5)%10;
        int newBai=(num/100%10+5)%10;
        int newQian=(num/1000%10+5)%10;
        int newNum=newGe*1000+newShi*100+newBai*10+newQian;
        return newNum;




    }
}
