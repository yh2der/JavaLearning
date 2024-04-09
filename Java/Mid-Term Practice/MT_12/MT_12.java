public class MT_12 {
    public static void main(String[] args) {
        int n = 100;
        int result = prime(n);
        System.out.println("第 " + n + " 個質數是：" + result);
    }

    public static int prime(int n) {
        int count = 0;
        int number = 2; // 從第一個質數開始尋找
        while (count < n) {
            if (isPrime(number)) {
                count++;
            }
            if (count == n) {
                break;
            }
            number++;
        }
        return number;
    }

    public static boolean isPrime(int num) {
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
}
