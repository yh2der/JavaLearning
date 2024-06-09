import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;

class Data {
    private String name;
    private int english;
    private int math;

    public Data(String str, int e, int m) {
        name = str;
        english = e;
        math = m;
    }
    public void writeData() {
        try (FileWriter writer = new FileWriter("student.txt", StandardCharsets.UTF_8, true)) {
            writer.write("姓名: " + name + "\n");
            writer.write("英文成績: " + english + "\n");
            writer.write("數學成績: " + math + "\n");
        } catch (IOException e) {
            System.out.println("寫入文件發生ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void show() {
        double average = (english + math) / 2.0;
        System.out.println("姓名: " + name);
        System.out.println("英文成績: " + english);
        System.out.println("數學成績: " + math);
        System.out.println("平均分: " + average);
    }
}

public class Ch14_10 {
    public static void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt", StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("姓名: ")) {
                    String name = line.substring(4);
                    int english = Integer.parseInt(reader.readLine().substring(6));
                    int math = Integer.parseInt(reader.readLine().substring(6));
                    Data student = new Data(name, english, math);
                    student.show();
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println("讀取發生ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);

        stu1.writeData();
        stu2.writeData();

        readData();
    }
}
