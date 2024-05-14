import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ch14_5 {
    public static void main(String[] args) {
        String fileName = "donkey.txt";
        int charCount = 0;
        boolean firstLine = true;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (firstLine && c == '\n') {
                    firstLine = false;
                    continue; // 跳过第一行的换行符
                }
                if (!firstLine) { // 如果已经读取过第一行，则开始计数
                    System.out.print((char)c);
                    charCount++;
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("總字數: " + charCount);
    }
}
