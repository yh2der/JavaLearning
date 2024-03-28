class Caaa {
    int a, b, c;
}
public class Ch8_1 {
    public static void main(String[] args) {
        //a
        Caaa obj = new Caaa();
        //b
        obj.a = 5;
        obj.b = 3;
        //c
        int c = obj.a + obj.b;
        //d
        System.out.printf("a = %d\nb = %d\nc = %d", obj.a, obj.b, c);
    }
}