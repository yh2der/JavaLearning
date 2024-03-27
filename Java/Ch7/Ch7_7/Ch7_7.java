public class Ch7_7 {
    static boolean is_even(int n) {
        if (n%2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 100;
        for (int i=1; i<n+1; i++) {
            if (i%9 == 0 && is_even(i)) {
                System.out.println(i);
            }
        }
    }
}