import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ch14_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        try {
            System.out.print("請輸入一個整數 n: ");
            // str to int
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("讀取輸入時發生錯誤: " + e.getMessage());
            e.printStackTrace();
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1+2+...+" + n + " 的總和為: " + sum);

        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("關閉輸入流時發生錯誤: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
