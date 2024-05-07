import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class NotEven extends Exception {
    public NotEven(String s) {
        super(s);
    }
}

public class Ch13_20 {
    public static void main(String args[]) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("請輸入一個整數 n: ");
            int n = Integer.parseInt(reader.readLine());
            even(n);
        } catch (IOException e) {
            System.out.println("IO 錯誤: " + e.getMessage());
        } catch (IllegalArgumentException | NotEven e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void even(int n) throws NotEven {
        if (n < 0) {
            throw new IllegalArgumentException("n值小於0, 無法處理");
        }
        if (n % 2 != 0) {
            throw new NotEven("n值為奇數, 無法處理");
        }
        for (int i = 0; i <= n; i += 2)
            System.out.print(i + " ");
        System.out.println();
    }
}
