import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ch14_4 {
    public static void main(String[] args) throws IOException {
        String fileName = "donkey.txt";
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
                charCount++;
            }
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n讀取的字元數: " + charCount);
    }
}
