public class Ch12_20 {
    public static double cal(double a, double b) {
        double ans = 0.0;
        ans = Math.atan(a) + Math.acos(b);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(cal(1, 0.5));
    }
}