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
    //16
    static double average(CCircle cir[]) {
        int n = cir.length;
        double avg = 0;
        for (int i=0; i<n; i++) {
            avg += cir[i].radius;
        }
        return avg/n;
    }
}
public class Ch9_16 {
    public static void main(String[] args) {
        CCircle cir[] = new CCircle[3];
        cir[0] = new CCircle(2.0);
        cir[1] = new CCircle(3.0);
        cir[2] = new CCircle(4.0);
        System.out.println(CCircle.average(cir));
    }
}