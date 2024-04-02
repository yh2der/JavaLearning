class Caaa {
   public int n1;
   public int n2;
}
class Cbbb extends Caaa {
    void set_num(int a, int b) {
        n1 = a;
        n2 = b;
    }
    void show() {
        System.out.printf("n1 = %d\nn2 = %d", n1, n2);
    }
}
public class Ch10_1 {
    public static void main(String[] args) {
        Cbbb bb=new Cbbb();
        bb.set_num(5,10);
        bb.show();
    }
}