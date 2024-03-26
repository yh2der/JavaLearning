class Fraction{   // 分數類別   
    private int num, den;
    //a
    Fraction(int n, int d) {
        num = n;
        den = d;
    }
    //b
    public void setN(int n) { 	// 設定分子      
        num = n;
    }
    public void setD(int d){		// 設定分母     
        den = d; 
    }
    //c 
    public void setND(int n, int d) {
        num = n;
        den = d;
    }      
    public void show(){
        System.out.println(num + "/" + den);   // 顯示分數
    }
    static Fraction compare(Fraction f1, Fraction f2) {
        if (f1.num*f2.den > f2.num*f1.num) {
            return f1;
        }
        return f2;
    }      
}
public class Ch9_14 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(1,2);
        Fraction f3;
        f3 = Fraction.compare(f1, f2);
        f3.show();
    }
}