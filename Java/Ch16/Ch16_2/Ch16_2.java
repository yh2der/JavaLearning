class Circle<T> {
    T value;
    public void setValue(T a) {
        value = a;
    }
    public void show() {
        System.out.println(value);
    }
}
public class Ch16_2 {
    public static void main(String[] args) {
        Circle<Double> s1 = new Circle<Double>();
        Circle<String> s2 = new Circle<String>();
        s1.setValue(2.0);
        s2.setValue("Blue");
        s1.show();
        s2.show();
    }
}