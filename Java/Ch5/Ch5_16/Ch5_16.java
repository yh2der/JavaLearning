public class Ch5_16 {
    public static void main(String[] args) {
        int num = 64;

        for (int i=1; i<=64; i++) {
            if (num%i == 0) {
                System.out.println(i);
            }
        }
    }
}