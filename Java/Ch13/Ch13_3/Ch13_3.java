public class Ch13_3 {
    public static void main(String[] args) {
        int num = 12, den = 0;
        try {
            int ans = num / den;
            System.out.println("ans：" + ans);
        } catch (ArithmeticException e) {
            System.out.println("除數為0");
        }
        System.out.println("main() ended!!");
    }
}
