import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Ch16_16 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        Collections.addAll(alist, "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        // (b) 正向走訪並印出 alist 物件的所有元素
        System.out.println("正向走訪 alist 物件的所有元素:");
        ListIterator<String> forwardIterator = alist.listIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        // (b) 反向走訪並印出 alist 物件的所有元素
        System.out.println("\n反向走訪 alist 物件的所有元素:");
        ListIterator<String> iterator = alist.listIterator(alist.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}