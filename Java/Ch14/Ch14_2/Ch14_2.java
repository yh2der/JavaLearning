import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ch14_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.print("請輸入一個字串: ");
        str = buf.readLine();
        System.out.println("轉換後的字串為: " + str.toUpperCase());
    }
}
