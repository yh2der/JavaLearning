class PrePaid extends Thread {
    private static int sum = 200; // 共享的電話卡餘額

    public void run() {
        while (sum > 10) {
            int fee = (int) (100 * Math.random()); // 產生 0~99 的亂數作為通話費
            talk(fee);           
        }
    }

    // 同步方法，確保每次只有一個執行緒能訪問此方法
    private synchronized void talk(int fee) {
        int temp = sum - fee;
        try {
            Thread.sleep(100); // 故意拖延時間，模擬同步問題
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        if (temp <= 0) {
            System.out.println("餘額不足");
        } else {
            sum = temp;
            System.out.println("打了" + fee + "元，餘額" + sum + "元");
        }            
    }
}
public class Ch15_12 {
    public static void main(String[] args) {
        PrePaid phone1 = new PrePaid();
        PrePaid phone2 = new PrePaid();
        PrePaid phone3 = new PrePaid();

        phone1.start();
        phone2.start();
        phone3.start();
    }
}
