class Test {
    static void test(int num, int den) {
        if (den == 0) {
            throw new ArithmeticException("den = 0");
        }
        System.out.println(num + "/" + den + "=" + num / den);
    }
}
public class Ch13_10 {    
    public static void main(String[] args) {
        try {
            Test t = new Test();
            t.test(2, 0);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}