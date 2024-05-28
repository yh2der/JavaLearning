import java.util.LinkedList;
import java.util.Random;
import java.util.ListIterator;

public class Ch16_15 {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        Random rand = new Random();
        for (int i=0; i<10; i++) {
            llist.add(rand.nextInt(101));
        }
        System.out.println(llist);

        ListIterator<Integer> iterator = llist.listIterator(llist.size());
        int sum = 0;
        System.out.println("llist 反向走訪的所有元素: ");
        while (iterator.hasPrevious()) {
            int num = iterator.previous();
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println();

        System.out.println("所有元素的和為: " + sum);
        
    }
}