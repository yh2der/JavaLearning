// Ex11_1，抽象類別裡建構子
abstract class Caaa {
    protected int num;
    // 請在此處撰寫類別Caaa的建構子
    Caaa(int n) {
        num = n;
    }
    public abstract void show();
}
class Cbbb extends Caaa{
    // 請在此處撰寫類別Cbbb的建構子
    Cbbb(int n) {
        super(n);
    }
    // 請在此處撰寫show() method
    public void show() {
        System.out.println("num = " + num);
    }
}

public class Ch11_1 {
    public static void main(String[] args) {
        Cbbb bb=new Cbbb(2); 		// 此行可設定num成員的值為2
        bb.show();				// 此行可印出 "num=2" 字串
    }
}