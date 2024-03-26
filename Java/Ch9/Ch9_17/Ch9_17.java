class CCircle {
    private static double pi = 3.14;
    private double radius;

    public CCircle(double r) {
        radius = r;
    }
    public void show() {
        System.out.println("area=" + pi*radius*radius);
    }
}
public class Ch9_17 {
    public static void main(String[] args) {
        CCircle cir[] = new CCircle[3];
        double r[] = {2.0, 3.0, 4.0};
        for (int i=0; i<cir.length; i++) {
            cir[i] = new CCircle(r[i]);
            cir[i].show();
        }
    }
}