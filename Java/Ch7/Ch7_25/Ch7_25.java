public class Ch7_25 {
    static long fib_for(int n) {
        int fib = 1;
        int prev = 1;
        for (int i=2; i<n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
    static long fib_rec(int n) {
        if (n==1 || n==2) {
            return 1;
        }
        else {
            return fib_rec(n-1) + fib_rec(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fib_for(6));
        System.out.println(fib_rec(6));
    }
    
}