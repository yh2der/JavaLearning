class Caaa {
    int a;
    int b;
    int sum;
}
public class MT_16 {
    public static void main(String[] args) {
        //a
        Caaa obj = new Caaa();
        //b
        obj.a = 5;
        obj.b = 8;
        //c
        obj.sum = obj.a+obj.b;
        //d
        System.out.println("a " + obj.a + " b " + obj.b + " sum " + obj.sum);
    }
}