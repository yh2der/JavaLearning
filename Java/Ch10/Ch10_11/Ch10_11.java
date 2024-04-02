class Caaa {
    public int n1, n2;
    public Caaa() {	 // 沒有引數的建構子
        n1 = n2 = 1;
    }
    public Caaa(int a, int b) {   // 有兩個引數的建構子
        n1 = a;
        n2 = b;
    }
    //a
    public void show() {
        System.out.println("n1 = " + n1 + "n2 = " + n2);
    }
}
//b
class Cbbb extends Caaa {
    Cbbb() {
        super();
    }
    //c
    Cbbb(int a, int b) {
        super(a, b);
    }
}
//d
public class Ch10_11 {
    public static void main(String[] args) {
        Cbbb obj = new Cbbb();
        Cbbb obj2 = new Cbbb(1, 2);
        obj.show();
        obj2.show();
    }
}