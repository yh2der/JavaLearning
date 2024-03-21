public class Ch5_27 {
    public static void main(String[] args) {
        int n = 100;
        for (int i=0; i<n; i++) {
            if (i%2 == 0 && i%3 == 0 && i%12 != 0) {
                System.out.printf("%d ", i);
                continue;
            }
        }
    }
}