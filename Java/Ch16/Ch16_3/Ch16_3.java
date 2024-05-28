import java.util.HashSet;
import java.util.TreeSet;

public class Ch16_3 {
    public static void main(String[] args) {
        // (a) 建立 HashSet 型態的物件 h1，內含整數元素 36 與 15
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(36);
        h1.add(15);

        // (b) 建立 TreeSet 型態的物件 t1，內含整數元素 52、23、32、69、10、7、36 與 15
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(52);
        t1.add(23);
        t1.add(32);
        t1.add(69);
        t1.add(10);
        t1.add(7);
        t1.add(36);
        t1.add(15);

        // (c) 將 h1 與 t1 物件中所有的元素印出
        System.out.println("h1 中的元素: " + h1);
        System.out.println("t1 中的元素: " + t1);

        // (d) 若是 t1 物件中包含有 32 的元素，則將該元素刪除，刪除後請將物件的內容重新印出
        // 若是找不到值為 32 的元素，則顯示字串 "t1中沒有元素32"
        if (t1.contains(32)) {
            t1.remove(32);
            System.out.println("t1 中的元素 (刪除 32 之後): " + t1);
        } else {
            System.out.println("t1中沒有元素32");
        }

        // (e) 請判別 t1 物件中是否包含 (a) 所建立之 h1 的所有元素
        if (t1.containsAll(h1)) {
            System.out.println("t1 包含 h1 的所有元素");
        } else {
            System.out.println("t1 不包含 h1 的所有元素");
        }
    }
}
