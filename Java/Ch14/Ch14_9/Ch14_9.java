import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ch14_9 {
    public static void main(String[] args) throws IOException {
        String file1 = "aaa.txt";
        String file2 = "bbb.txt";
        String file3 = "ccc.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file3))) {

            String line;
            // 讀取 aaa.txt 檔案的內容並寫入到 ccc.txt 中
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // 換行
            }

            // 讀取 bbb.txt 檔案的內容並寫入到 ccc.txt 中
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // 換行
            }

            System.out.println("成功將 " + file1 + " 與 " + file2 + " 的內容合併並寫入 " + file3);

        } catch (IOException e) {
            System.out.println("處理檔案時發生錯誤: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
