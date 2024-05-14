import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch14_11 {
    public static void main(String[] args) {
        // 呼叫 writeData() 函式生成隨機字母並寫入檔案
        writeData();
        
        // 呼叫 cnt() 函式讀取檔案並計算特定字母出現的次數
        cnt();
    }

    // 生成隨機字母並寫入檔案
    public static void writeData() {
        try {
            FileOutputStream fos = new FileOutputStream("rand99.txt");
            // 生成100個小寫英文字母的隨機數並寫入檔案
            for (int i = 0; i < 100; i++) {
                char letter = (char) ('a' + Math.random() * 26);
                fos.write(letter);
            }
            fos.close();
            System.out.println("rand99.txt 檔案已建立並寫入隨機字母。");
        } catch (IOException e) {
            System.out.println("寫入檔案時出錯：" + e.getMessage());
        }
    }

    // 讀取檔案並計算特定字母出現的次數
    public static void cnt() {
        try {
            FileInputStream fis = new FileInputStream("rand99.txt");
            int[] counts = new int[5]; // 用於存儲 a, e, i, o, u 出現的次數
            int data;
            while ((data = fis.read()) != -1) {
                char letter = (char) data;
                // 判斷字母是否為 a, e, i, o, u，若是則增加對應字母的出現次數
                switch (letter) {
                    case 'a':
                        counts[0]++;
                        break;
                    case 'e':
                        counts[1]++;
                        break;
                    case 'i':
                        counts[2]++;
                        break;
                    case 'o':
                        counts[3]++;
                        break;
                    case 'u':
                        counts[4]++;
                        break;
                    default:
                        break;
                }
            }
            fis.close();
            // 輸出各個字母的出現次數
            System.out.println("字母 a 出現次數: " + counts[0]);
            System.out.println("字母 e 出現次數: " + counts[1]);
            System.out.println("字母 i 出現次數: " + counts[2]);
            System.out.println("字母 o 出現次數: " + counts[3]);
            System.out.println("字母 u 出現次數: " + counts[4]);
        } catch (IOException e) {
            System.out.println("讀取檔案時出錯：" + e.getMessage());
        }
    }
}
