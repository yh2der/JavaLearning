public class Ch7_4 {
    public static void main(String[] args) {
        int ans = sum(10);
        System.out.print(ans);
    }
    static int sum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
}