package sub1;

public class Sphere {
    public double radius;
    public Sphere(double r) {
        radius = r;
    }
    public void show() {
        System.out.println(radius + "\n" + 4*Math.PI*radius*radius*radius/3);
    }
}
