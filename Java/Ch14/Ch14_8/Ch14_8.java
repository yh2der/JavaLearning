import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Ch14_8 {
    public static void main(String[] args) {
        String fileName = "proverb.txt";
        String line;
        int count = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                if (count != 1) {
                    System.out.println(line);
                }
                count++;            
        }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到檔案: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
