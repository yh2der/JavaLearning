import java.util.TreeSet;

public class Ch16_5 {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("Speech is silver, silence is golden.");
        t1.add("Two heads are better than one.");
        t1.add("East or west, home is best.");
        t1.add("It is never too late to learn.");
        System.out.println(t1);
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1.headSet("Speech"));
    }
}