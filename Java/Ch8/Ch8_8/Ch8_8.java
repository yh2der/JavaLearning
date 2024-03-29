class CCalculator {
    int a, b;
    //a 
    void set_value(int x, int y) {
        this.a = x;
        this.b = y;
    }
    //b
    void show() {
        System.out.printf("a = %d\nb = %d\n", a, b);
    }
    //c
    int add() {
        return a + b;
    }
    //d 
    int sub() {
        if (a > b) {
            return a - b;
        }
        else {
            return b - a;
        }
    }
    //e
    int mul() {
        return a * b;
    }
    //f
    double avg() {
        return (a + b)/2;
    }
}
public class Ch8_8 {
    public static void main(String[] args) {
        CCalculator obj = new CCalculator();
        obj.set_value(5, 12);
        System.out.println(obj.add());
        System.out.println(obj.mul());
        System.out.println(obj.sub());
        System.out.println(obj.avg());
        obj.show();
    }
}