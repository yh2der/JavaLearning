class Caaa {
    public int n1;
    public int n2;
    //a
    Caaa() {
        n1 = 1;
        n2 = 1;
    }
    //b
    Caaa(int a, int b) {
        n1 = a;
        n2 = b;
    }
}
class Cbbb extends Caaa {
    //c
    Cbbb() {
        super();
    }
    Cbbb(int a, int b) {
        super(a, b);
    }
    void set_num(int a, int b) {
        n1 = a;
        n2 = b;
    }
    void show() {
        System.out.printf("n1 = %d\nn2 = %d\n", n1, n2);
    }
}
public class Ch10_2 {
    public static void main(String[] args) {
        Cbbb b1=new Cbbb();
        Cbbb b2=new Cbbb(3,9);
        b1.show();
        b2.show();
    }
}