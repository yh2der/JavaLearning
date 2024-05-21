class Myprint implements Runnable {
    public String name;
    int n;
    Myprint(String str, int a) {
        name = str;
        n = a;
    }
    public void run() {
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(n);
            } catch(InterruptedException e) {}
            System.out.println(name + " is running");
        }        
    }
}
public class Ch15_7 {
    public static void main(String[] args) {
        Myprint m1 = new Myprint("Thread 1", 1000);
        Myprint m2 = new Myprint("Thread 2", 2500);
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}