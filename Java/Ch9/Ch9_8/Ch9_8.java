class MyMath {
    int pow = 1;
    void mypower(int x, int n) {
        for (int i=0; i<n; i++) {
            pow *= x;
        }
        System.out.println(pow);
    }
}
public class Ch9_8 {
    public static void main(String[] args) {
        MyMath p1=new MyMath();
        MyMath p2=new MyMath();
        p1.mypower(2,5);
        p2.mypower(3,4);
    }
}