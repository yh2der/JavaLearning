public class Ch12_19 {
    public static double f(int a) {
        double sum = 0.0;
        for (int i=1; i<=a; i++) {
            sum += Math.sqrt(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(f(5));
    }
}