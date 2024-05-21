class Myprint implements Runnable {
    String name;
    int interval;
    Myprint(String n, int a) {
        name = n;
        interval = a;
    }
    public void run() {
        for (int i=1; i<6; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(interval);
            } catch(InterruptedException e) {}
        }
    }
}
public class Ch15_10 {
    public static void main(String[] args) {
        Myprint m1 = new Myprint("Hello", 1000);
        Myprint m2 = new Myprint("Good bye", 2500);
        Thread hi = new Thread(m1);
        Thread bye = new Thread(m2);
        hi.start();
        bye.start();
    }
}