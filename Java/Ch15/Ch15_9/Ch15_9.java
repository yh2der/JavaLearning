class Pig implements Runnable {
    public void run() {
        System.out.println("小豬看到大野狼在爬煙囪");
        System.out.println("就在壁爐上煮了一鍋水");
        for (int i = 2; i <= 10; i += 2) {
            try {
                Thread.sleep(2000); // 每2分鐘
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + "分鐘 ");
        }
        System.out.println();
        System.out.println("一鍋煮沸的熱水煮好了");
    }
}

class Wolf implements Runnable {
    public void run() {
        System.out.println("大野狼對著第三隻小豬的房子吹氣");
        System.out.println("牠不停地吹氣又吹氣");
        System.out.println("還是不能把房子吹倒");
        System.out.println("大野狼非常的生氣");
        System.out.println("牠決定要從煙囪爬進小豬的家裡");
        
        Thread pigThread = new Thread(new Pig());
        pigThread.start();
        
        try {
            pigThread.join(); // 等待小豬煮水完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 3; i <= 15; i += 3) {
            try {
                Thread.sleep(3000); // 每3分鐘
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + "分鐘 ");
        }
        System.out.println("大野狼爬上煙囪了");
        System.out.println("大野狼從煙囪滑進房子裡");
        System.out.println("就被小豬煮好的水燙死了");
    }
}
public class Ch15_9 {
    public static void main(String[] args) {
        Thread wolfThread = new Thread(new Wolf());
        wolfThread.start();
    }
}
