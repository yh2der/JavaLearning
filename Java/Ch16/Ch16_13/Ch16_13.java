import java.util.ArrayList;
import java.util.Random;

public class Ch16_13 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i=0; i<10; i++) {
            alist.add(r.nextInt(101));
        }
        for (Integer i : alist) {
            System.out.print(i + " ");
        }
    }
}