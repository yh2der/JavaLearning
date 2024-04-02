class Truck {
    protected String name = "Toyota";   
}
public class Ch10_17 {
    public static void main(String[] args) {
        Truck t1 = new Truck();
        Class tr = t1.getClass();
        System.out.println(tr);
    }
}
