class Shape {  // 父類別Shape{}
    Shape() {}
    public double area() {   
        return 0.0;
    }
}
//a
class Circle extends Shape {
    double pi = 3.14;
    int radius = 1;
    Circle(double p, int r) {
        pi = p;
        radius = r;
    }
    public double area() {   
        return pi*radius*radius;
    }
}
//b
class Square extends Shape {
    int length = 1;
    int width = 1;
    Square(int l, int w) {
        length = l;
        width = w;
    }
    public double area() {   
        return length*width;
    }
}
//c
class Triangle extends Shape {
    int base = 1;
    int height = 1;
    Triangle(int b, int h) {
        base = b;
        height = h;
    }
    public double area() {   
        return base*height/2;
    }
}
//d
public class Ch10_9 {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 1);
        Circle c2 = new Circle(2, 2);
        Square s1 = new Square(1, 1);
        Square s2 = new Square(2, 2);
        Triangle t1 = new Triangle(1, 1);
        Triangle t2 = new Triangle(2, 2);
        System.out.println(largest(c1, c2, s1, s2, t1, t2));
    }
    static double largest(Circle c1, Circle c2, Square s1, Square s2, Triangle t1, Triangle t2) {
        double max = 0.0;
        if (c1.area() > c2.area())  max = c1.area();
        else    max = c2.area();
        if (s1.area() > max) max = s1.area();
        if (s2.area() > max) max = s2.area();
        if (t1.area() > max) max = t1.area();
        if (t2.area() > max) max = t2.area();
        return max;
    }
}