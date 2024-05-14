import java.io.FileWriter;
import java.io.IOException;

public class Ch14_6 {
    public static void main(String[] args) {
        char hi[] = {'H','e','l','l','o',' ','J','a','v','a','!','\r','\n'};
        String fileName = "hello.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(hi);
            System.out.println("字元陣列成功寫入檔案 " + fileName);
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
