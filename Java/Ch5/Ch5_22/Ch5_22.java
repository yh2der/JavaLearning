public class Ch5_22 {
    public static void main(String[] args) {
        int n = 50000;

        for (int i=0; i<n; i++) {
            if (i%3 == 1) {
                if (i%5 == 3) {
                    if (i%7 == 2) {
                        System.out.printf("%d 隻", i);
                        break;
                    }
                }
            }
        }
    }
}