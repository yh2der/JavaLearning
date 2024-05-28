class Ball<T> {
    private T color;
    public void setValue(T a) {
        color = a;
    }
    public void show() {
        System.out.println(color);
    }
}
public class Ch16_1 {
    public static void main(String[]args) {
        Ball<String> b1 = new Ball<>();
        Ball<Integer> b2 = new Ball<>();
        b1.setValue("Red");
        b2.setValue(255);
        b1.show();
        b2.show();
    }
}