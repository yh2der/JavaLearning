import java.util.Random;
import java.util.TreeSet;

public class Ch16_14 {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        Random rand = new Random();
        
        while (tset.size() < 10) {
            tset.add(rand.nextInt(100)); // 0~99 的亂數
        }

        System.out.println("tset 的所有元素: ");
        for (int num : tset) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : tset) {
            sum += num;
        }
        double average = (double) sum / tset.size();
        System.out.println("所有元素的平均值為: " + average);
    }
}
