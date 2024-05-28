import java.util.ArrayList;

public class Ch16_8 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Homer sometimes nods.");
        alist.add("Beauty is in the eye of beholder.");
        alist.add("Example is better than precept.");
        alist.add("Learn to walk before you run.");
        alist.add("Make hay while the sun shines.");
        for (int i=0; i<alist.size(); i++) {
            System.out.println(alist.get(i));
        }
    }
}