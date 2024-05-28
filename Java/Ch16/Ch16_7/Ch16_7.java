import java.util.LinkedList;
import java.util.ArrayList;

public class Ch16_7 {
    public static void main(String[] args) {
        //a
        LinkedList<String> llist = new LinkedList<>();
        llist.add("apple");
        llist.add("guava");
        System.out.println(llist);
        //b
        ArrayList<String> alist = new ArrayList<>();
        alist.add("tomato");
        alist.add("apple");
        alist.add("papaya");
        alist.add("grape");
        System.out.println(alist);
        //c
        alist.addAll(llist);
        System.out.println(alist);
        //d
        System.out.println(alist.indexOf("apple"));
        System.out.println(alist.lastIndexOf("apple"));
    }
}