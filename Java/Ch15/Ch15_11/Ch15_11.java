class Animal implements Runnable {
    private String id;

    public Animal(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(id + "來了" + i + "次");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ch15_11 {
    public static void main(String[] args) {
        Animal Tom = new Animal("狸克");
        Animal Redd = new Animal("狐利");
        Animal Tortimer = new Animal("壽伯");
        Animal Blathers = new Animal("傅達");

        Thread t1 = new Thread(Tom);
        Thread t2 = new Thread(Tortimer);
        Thread t3 = new Thread(Blathers);
        Thread t4 = new Thread(Redd);

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All Threads are finished");
    }
}
