public class Ch5_14 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<101; i++) {
            sum += i*i;
        }

        System.out.printf("1~100平方和 = %d", sum);
    }
}