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
    //15
    void larger(Fraction f2) {
        if (num*f2.den > f2.num*den) {
            System.out.println("f1 is larger");
        }
        else {
            System.out.println("f2 is larger");
        }
    }
}
public class Ch9_15 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 3);
        Fraction f2 = new Fraction(4, 3);
        f1.larger(f2);
    }
}