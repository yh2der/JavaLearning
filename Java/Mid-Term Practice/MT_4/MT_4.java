public class MT_4 {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0.0;
        for (int i=1; i<n+1; i++) {
            sum += (1.0 / i);
        }
        System.out.println(sum);
    }
}