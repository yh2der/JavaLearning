public class Ch7_6 {
    static boolean is_even(int n) {
        if (n%2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        if (is_even(5)) {
            System.out.println("n是偶數");
        }
        else {
            System.out.println("n是奇數");
        }
    }
}