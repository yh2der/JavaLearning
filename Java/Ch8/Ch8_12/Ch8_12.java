class CCircle {
    //a
    double area(double r) {
        return r*r*3.14;
    }
    //b
    float area(float r) {
        return r*r*3.14f;
    }
    //c
    double area(int r) {
        return r*r*3.14;
    }
}
public class Ch8_12 {
    public static void main(String[] args) {
        CCircle circle = new CCircle();
        System.out.println(circle.area(2));
        System.out.println(circle.area(2.2f));
        System.out.println(circle.area(2.2));
    }
}