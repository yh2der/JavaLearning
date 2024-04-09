public class MT_15 {
    public static void main(String[] args) {
        System.out.println(sum2(5));
    }
    static int sum2(int n) {
        if (n==1) {
            return 2;
        }
        return sum2(n-1) + 2*n;
    }
}