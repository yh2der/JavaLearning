class Sub implements Runnable {  
    private int n;
    private int sum = 1;
    public Sub(int a) {
        n = a;
    }
    public void run() {
        for (int i=1; i<n+1; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
public class Ch15_6 {
    public static void main(String[] args) {
        Sub s1 = new Sub(5);
        Sub s2 = new Sub(10);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }
}
