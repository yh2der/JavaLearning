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
    //12
    int getN() {
        return num;
    }
    int getD() {
        return den;
    }         
}
public class Ch9_12 {
    static void show(Fraction f) {
        System.out.println(f.getN() + "/" + f.getD());   // 顯示分數
    }
    public static void main(String[] args) {
        Fraction f = new Fraction(5,3);
        show(f);
    }
}