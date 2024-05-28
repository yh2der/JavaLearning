import java.util.TreeMap;
import java.util.Random;

public class Ch16_10 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        Random rand = new Random();
        for (int i=1; i<=5; i++) {
            tmap.put(i, rand.nextInt(101));
        }
        System.out.println(tmap);
        int sum = 0;
        for (int value : tmap.values()) {
            sum += value;
        }
        double average = (double) sum / tmap.size();
        System.out.println("對應值的總和為: " + sum);
        System.out.println("對應值的平均值為: " + average);
    }
}