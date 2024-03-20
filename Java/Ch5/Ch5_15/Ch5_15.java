public class Ch5_15 {
    public static void main(String[] args) {
        int sum = 1;

        for (int i=1; i<=10; i++) {
            sum *= i;
        }
        System.out.printf("1x2x3x...x10 = %d", sum);
    }
}