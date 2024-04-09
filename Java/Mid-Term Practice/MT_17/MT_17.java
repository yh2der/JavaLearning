//a
class Trapezoid {
    int upper;
    int base;
    int height;
    //b
    int area() {
        return (upper+base) * height / 2;
    }
    //e
    void show() {
        System.out.println("upper=" + upper + "\tbase= " + base + "\theight=" + height);
    }
}
public class MT_17 {
    public static void main(String[] args) {
        //c
        Trapezoid obj = new Trapezoid();
        //d
        obj.upper = 4;
        obj.base = 9;
        obj.height = 5;
        //f
        System.out.println(obj.area());
        obj.show();
    }
}