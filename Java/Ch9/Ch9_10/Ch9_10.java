class CCircle {
    private static double pi = 3.14;
    private double radius;

    public CCircle(double r) {
        radius = r;
    }
    public CCircle compare(CCircle cir) {
        if (this.radius > cir.radius) {
            return this;
        }
        else {
            return cir;
        }
    }
}
public class Ch9_10 {
    public static void main(String[] args) {
        CCircle cir1 = new CCircle(1.0);
        CCircle cir2 = new CCircle(2.0);
        CCircle obj;

        obj = cir1.compare(cir2);
        if (cir1 == obj)
            System.out.println("radius of cir1 is larger");
        else    
            System.out.println("radius of cir2 is larger");
    }
}