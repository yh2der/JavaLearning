public class MT_9 {
    public static void main(String[] args) {
        System.out.println(power(5, 3));        
    }
    static int power(int x, int n) {
        int ans = 1;
        for (int i=0; i<n; i++) {
            ans *= x;
        }
        return ans;
    }
}