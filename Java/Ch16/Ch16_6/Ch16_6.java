import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ch16_6 {
    public static void main(String[] args) {
        Random rand = new Random();        
        // (a)
        LinkedList<Integer> llist = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            llist.add(rand.nextInt(101)); // 0~100 的亂數
        }
        System.out.println("llist 中的元素 (亂數): " + llist);       
        // (b)
        llist.add(150);
        llist.add(55);
        llist.add(10);
        System.out.println("llist 中的元素 (加入 150、55、10 之後): " + llist);      
        // (c)
        llist.set(5, 999);
        System.out.println("llist 中的元素 (置換索引值 5 的元素之後): " + llist);        
        // (d) 
        System.out.println("llist 中的第一個元素: " + llist.getFirst());
        System.out.println("llist 中的最後一個元素: " + llist.getLast());        
        // (e)
        System.out.println("索引值 2~5 的子集合: " + llist.subList(2, 6));
    }
}
