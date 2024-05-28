import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ch16_9 {
    public static void main(String[] args) {
        // (a)
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            hmap.put(i, rand.nextInt(101)); // 0~100 的亂數
        }

        // (b) 
        TreeSet<Integer> tset = new TreeSet<>(hmap.values());

        // (c) 
        HashSet<Integer> hset = new HashSet<>(hmap.keySet());

        // (d) 
        System.out.println("hmap 中的所有元素: " + hmap);
        System.out.println("tset 中的所有元素: " + tset);
        System.out.println("hset 中的所有元素: " + hset);
    }
}
