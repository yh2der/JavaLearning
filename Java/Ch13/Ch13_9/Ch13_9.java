public class Ch13_9 {
    static void test(int num,int den){
        System.out.println(num+"/"+den+"="+num/den);
    }
    public static void main(String[] args) {
        try {
            test(2, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("den = 0");
        }
    }
}