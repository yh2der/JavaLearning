public class Ch7_14 {
    public static void main(String[] args) {
        System.out.println(abs(-2));
    }
    static int abs(int n) {
        if (n > 0) {
            return 0;
        }
        else {
            return n*(-1);
        }
    } 
}