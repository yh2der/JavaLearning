class CCircle {
    private static double pi = 3.14;
    protected double radius;
    public void show() {
        System.out.println("area = " + pi*radius*radius);
    }
    double get_pi() {
        return pi;
    }
}
class Coin extends CCircle {
    private int value;
    
    public Coin(double r, int v) {
        radius = r;
        value = v;
        System.out.println("radius = " + radius + ", value = " + value);
    }
    void print_pi() {
        System.out.println("pi = " + get_pi());
    }
}
public class Ch10_6 {
    public static void main(String[] args) {
        Coin coin=new Coin(2.5,10);  
        coin.show();
        coin.print_pi();
    }
} 