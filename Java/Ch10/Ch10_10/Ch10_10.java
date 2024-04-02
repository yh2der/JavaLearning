class Shape {  // 父類別Shape{}
    Shape() {}
    public double area() {   
        return 0.0;
    }
    static double largest(Shape[] shapes) {
        double max = 0.0;
        for (Shape shape : shapes) {
            if (shape.area() > max) {
                max = shape.area();
            }
        }
        return max;
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
public class Ch10_10 {
    public static void main(String[] args) {
        Shape sha[] = {
            new Circle(1, 1),
            new Circle(2, 2),
            new Square(1, 1),
            new Square(2, 2),
            new Triangle(1, 1),
            new Triangle(2, 2)
        };
        
        System.out.println(Shape.largest(sha));
    }
    
}