public class MT_13 {
    public static void main(String[] args) {
        int count = 0;
        int p = 2;
        while (count < 8) {
            if (isMersennePrime(p)) {
                System.out.println("第 " + (count + 1) + " 個梅森尼質數為：" + ((long)Math.pow(2, p) - 1));
                count++;
            }
            p++;
        }
    }

    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMersennePrime(int p) {
        long candidate = (long) Math.pow(2, p) - 1;
        return isPrime(candidate);
    }
}
