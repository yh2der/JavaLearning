package sub2;
public class Compute extends sub1.MyMath {
    int ans;
    public int add(int a, int b) {
        ans = a + b;
        return ans;
    };
    public int sub(int a, int b){
        ans = a - b;
        return ans;
    };
    public int mul(int a, int b) {
        ans = a * b;
        return ans;
    };
    public int div(int a, int b) {
        ans = a / b;
        return ans;
    };
    public void show() {
        System.out.println(ans);
    }
}