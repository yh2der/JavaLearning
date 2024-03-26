class Summation {
    static void add(int n) {
        int sum = 0;
        for (int i=1; i<n+1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
public class Ch9_7 {
    public static void main(String[] args) {
        Summation.add(5);
        Summation.add(10);
    }
}