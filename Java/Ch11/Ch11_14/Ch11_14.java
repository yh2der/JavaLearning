class Shape {}
class Circle extends Shape {}
class Triangle extends Shape {}
class Coin extends Circle {}

public class Ch11_14 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        Coin n1 = new Coin();

        System.out.println("c1 instanceof Coin " + (c1 instanceof Coin));
        System.out.println("t1 instanceof Shape " + (t1 instanceof Shape));
        System.out.println("n1 instanceof Object " + (n1 instanceof Object));
        System.out.println("null instanceof Object " + (null instanceof Object));
    }
}