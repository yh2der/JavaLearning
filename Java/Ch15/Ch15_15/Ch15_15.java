class PrimeCounter extends Thread {
    private int start;
    private int end;
    private int count;

    public PrimeCounter(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("執行緒計算完成，區間 " + start + " 到 " + end + " 內的質數個數為：" + count);
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Ch15_15 {
    public static void main(String[] args) {
        PrimeCounter counter1 = new PrimeCounter(2, 100000);
        PrimeCounter counter2 = new PrimeCounter(100001, 200000);
        counter1.start();
        counter2.start();
    }
}
