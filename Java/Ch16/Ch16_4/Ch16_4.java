import java.util.HashSet;
import java.util.TreeSet;

public class Ch16_4 {
    public static void main(String[] args) {
        //a
        HashSet<Integer> hset = new HashSet<Integer>();
        hset.add(65);
        hset.add(29);
        hset.add(18);
        hset.add(34);
        System.out.println(hset);
        //b
        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.add(97);
        tset.add(62);
        tset.add(53);
        System.out.println(tset);
        //c
        tset.addAll(hset);
        System.out.println(tset);
        //d
        int firstElement = tset.first();
        int lastElement = tset.last();
        double average = (firstElement + lastElement) / 2.0;
        System.out.println("tset 中的第一個元素: " + firstElement);
        System.out.println("tset 中的最後一個元素: " + lastElement);
        System.out.println("第一個元素與最後一個元素之平均值: " + average);
        
    }
}