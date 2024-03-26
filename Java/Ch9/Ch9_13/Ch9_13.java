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
    //13
    Fraction add(Fraction f) {
        int temp_num = (num*f.den) + (den*f.num);
        int temp_den = den*f.den;
        Fraction ff = new Fraction(temp_num, temp_den);
        return ff;
    }      
}
public class Ch9_13 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,5);
        Fraction f2 = new Fraction(1,4);
        Fraction result= f1.add(f2);
        result.show();
    }
}