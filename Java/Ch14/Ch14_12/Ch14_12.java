import java.io.*;
import java.util.Arrays;

public class Ch14_12 {
    public static void main(String[] args) {
        writeData();
        readData();
        sortData();
    }

    public static void writeData() {
        try {
            FileOutputStream fos = new FileOutputStream("rand.txt");
            PrintWriter writer = new PrintWriter(fos);
            for (int i = 0; i < 1000; i++) {
                int randomNumber = (int) (Math.random() * 99999) + 1;
                writer.println(randomNumber);
            }
            writer.close();
            System.out.println("rand.txt 文件已以創建並產生隨機數。");
        } catch (IOException e) {
            System.out.println("寫入文件時出錯：" + e.getMessage());
        }
    }

    public static void readData() {
        try {
            FileInputStream fis = new FileInputStream("rand.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);

            int sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
            reader.close();

            double average = (double) sum / 1000;
            System.out.println("平均值: " + average);
            System.out.println("最小值: " + min);
            System.out.println("最大值: " + max);
        } catch (IOException e) {
            System.out.println("讀取件時出錯：" + e.getMessage());
        }
    }

    public static void sortData() {
        try {
            FileInputStream fis = new FileInputStream("rand.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);

            int[] numbers = new int[1000];
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                numbers[index++] = number;
            }
            reader.close();

            Arrays.sort(numbers);

            FileOutputStream fos = new FileOutputStream("rand2.txt");
            PrintWriter writer = new PrintWriter(fos);
            for (int i = 0; i < 1000; i++) {
                writer.println(numbers[i]);
            }
            writer.close();
            System.out.println("rand2.txt 文件已創建並排序。");
        } catch (IOException e) {
            System.out.println("寫入文件時出錯：" + e.getMessage());
        }
    }
}
