import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ch14_1 {
    public static void main(String[] args) {
        BufferedReader buf;
        String str;

        buf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input a string: ");
            str = buf.readLine();  // 將輸入的文字指定給字串變數str存放

            System.out.println("string=" + str);   // 印出字串
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
