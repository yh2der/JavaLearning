public class MT_10 {
    public static void main(String[] args) {
        System.out.println(is_prime(31));        
    }
    static boolean is_prime(int n) {
        //開根號的函式在Math
        for (int i=2; i<Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}