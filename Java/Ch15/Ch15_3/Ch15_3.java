class Test extends Thread {
    String id;
    Test(String str) {
        id = str;
    }
    public void run(){
        for(int i=1; i<=5; i++) {
            for(int j=0; j<100000000; j++);
            System.out.println(id + " " + i);
        }
    }
}
public class Ch15_3 {
    public static void main(String[] args) {
        Test hi = new Test("Hello");
        Test bye = new Test("Good bye");
        Test morning = new Test("Good morning");
        Test night = new Test("Good night");
        hi.start();
        bye.start();
        morning.start();
        night.start();
    }
}