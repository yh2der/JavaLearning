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
}
public class Ch9_11 {
    public static void main(String[] args) {
        Fraction f = new Fraction(5,3);
        f.show();
        f.setN(7);
        f.setD(12);
        f.show();
        f.setND(100,120);
        f.show();
    }
}