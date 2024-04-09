public class MT_11 {
    public static void main(String[] args) {
        System.out.println(total(1, 1, 1));
    }
    static double total(double p, double r, int n) {
        double t = 0.0;
        double temp = 1.0;
        for (int i=0; i<n; i++) {
            temp *= (1+r);
        }
        t = p * temp;
        return t;
    }
}