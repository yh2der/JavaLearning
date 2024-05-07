class NotOddException extends Exception {
    public NotOddException(String message) {
        super(message);
    }
}
public class Ch13_15 {
    public static void main(String args[]) {
        try {
            odd(2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NotOddException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void odd(int n) throws IllegalArgumentException, NotOddException {
        if (n <= 0)
            throw new IllegalArgumentException("n值小於等於0, 無法處理");
        else if (n % 2 == 0)
            throw new NotOddException("n值為偶數, 無法處理");
        else {
            for (int i = 1; i <= n; i += 2)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}