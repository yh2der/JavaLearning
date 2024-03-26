//a
class Count {
    static int cnt = 0;
    Count() {
        cnt++;
    }
    //b
    void setZero() {
        cnt = 0;
    }
    //c
    void setValue(int n) {
        cnt = n;
    }
    //d
    void show() {
        System.out.println(cnt);
    }
}
public class Ch9_6 {
    public static void main(String[] args) {
        //e
        Count c1 = new Count();
        Count c2 = new Count();
        c2.show();
        //f
        c2.setZero();
        c2.show();
        c2.setValue(10);
        c2.show();
    }
}