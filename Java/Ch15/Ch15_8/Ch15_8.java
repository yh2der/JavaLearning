class Myprint implements Runnable {
    private String name;
    private int interval;
    private int count;
    Myprint(String n, int i, int c) {
        name = n;
        interval = i;
        count = c;
    }
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " is running...");
        }
    }
}
public class Ch15_8 {
    public static void main(String[] args) {
        Myprint m1 = new Myprint("Thread 1", 1000, 5);        
        Myprint m2 = new Myprint("Thread 2", 2500, 10);        
        Myprint m3 = new Myprint("Thread 3", 3500, 5);
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        t1.start();
        t2.start();        
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }
}
