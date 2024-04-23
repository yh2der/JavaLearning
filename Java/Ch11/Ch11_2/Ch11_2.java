// Ex11_2, 抽象類別
abstract class MyMath {
    protected int ans;
    public void show() {
        System.out.println("ans="+ans);
    }
    public abstract void add(int a, int b);    // 計算 a+b
    public abstract void sub(int a, int b);    // 計算 a-b
    public abstract void mul(int a, int b);    // 計算 a*b 
    public abstract void div(int a, int b);    // 計算 a/b   
}
class Compute extends MyMath { 
    // 請完成這個部分的程式碼
    public void add(int a, int b) {
        ans = a+b;
    }
    public void sub(int a, int b) {
        ans = a-b;
    }
    public void mul(int a, int b) {
        ans = a*b;
    }
    public void div(int a, int b) {
        ans = a/b;
    }
}
public class Ch11_2 {
    public static void main(String args[]) {
        Compute cp = new Compute();
        cp.mul(3,5); // 計算3*5
        cp.show();	// 此行會回應 "ans=15" 字串
    }
}
