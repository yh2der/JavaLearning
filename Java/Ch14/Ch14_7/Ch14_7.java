import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Ch14_7 {
    public static void main(String[] args) {
        String fileName = "hello.txt";
        String newContent = "Welcome!\n";

        try (FileWriter writer = new FileWriter(fileName, true)) { // 第二个参数设置为 true，表示追加模式
            writer.write(newContent);
            System.out.println("成功追加字串到檔案 " + fileName);
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("檔案內容:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
