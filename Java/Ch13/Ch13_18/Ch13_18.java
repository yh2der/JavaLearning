import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

class ArgumentOutOfBound extends Exception {
    public ArgumentOutOfBound(String s) {
        super(s);
    }
}

public class Ch13_19 {
    public static boolean prime(int n) throws ArgumentOutOfBound {
        if (n <= 1) {
            throw new ArgumentOutOfBound("n小於或等於1");
        }
        // 檢查 n 是否為質數
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // 不是質數
            }
        }
        return true; // 是質數
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("請輸入一個整數 n: ");
            int n = scn.nextInt();
            if (prime(n)) {
                System.out.println(n + " 是質數");
            } else {
                System.out.println(n + " 不是質數");
            }
        } catch (ArgumentOutOfBound e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤，請輸入整數。");
        } catch (IOException e) {
            System.out.println("發生IO錯誤: " + e.getMessage());
        }
    }
}
