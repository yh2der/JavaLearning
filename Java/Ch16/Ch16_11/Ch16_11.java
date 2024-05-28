import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeMap;

public class Ch16_11 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // (a)
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for (int i = 0; i < 5; i++) {
            int randomKey = rand.nextInt(101); // 0~100 的亂數
            tmap.put(randomKey, i);
        }

        // (b) 
        HashSet<Integer> hset = new HashSet<>(tmap.keySet());

        // (c) 
        System.out.println("tmap 的所有元素: " + tmap);
        System.out.println("hset 的所有元素: " + hset);
    }
}
