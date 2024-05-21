import java.io.*;
import java.util.Arrays;
import java.util.Random;

class BSort extends Thread {
    private double[] data;

    public BSort(double[] data) {
        this.data = data;
    }

    public void run() {
        bubbleSort(data);
        writeToFile("bresult.txt", data);
    }

    public static void bubbleSort(double[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Swap data[j] and data[j+1]
                    double temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void writeToFile(String filename, double[] data) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (double d : data) {
                writer.write(Double.toString(d) + "\n");
            }
            writer.close();
            System.out.println("已將排序後的結果存入 " + filename);
        } catch (IOException e) {
            System.out.println("寫入文件時出現錯誤：" + e.getMessage());
        }
    }
}

class QSort extends Thread {
    private double[] data;

    public QSort(double[] data) {
        this.data = data;
    }

    public void run() {
        quickSort(data, 0, data.length - 1);
        writeToFile("qresult.txt", data);
    }

    public static void quickSort(double[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    public static int partition(double[] data, int low, int high) {
        double pivot = data[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                double temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        double temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    public static void writeToFile(String filename, double[] data) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (double d : data) {
                writer.write(Double.toString(d) + "\n");
            }
            writer.close();
            System.out.println("已將排序後的結果存入 " + filename);
        } catch (IOException e) {
            System.out.println("寫入文件時出現錯誤：" + e.getMessage());
        }
    }
}

public class Ch15_14 {
    public static void main(String[] args) {
        // 產生十萬筆亂數並存入 bdata.txt
        generateRandomData("bdata.txt");
        
        // 產生十萬筆亂數並存入 qdata.txt
        generateRandomData("qdata.txt");

        // 讀取 bdata.txt 中的數據
        double[] bData = readData("bdata.txt");
        // 讀取 qdata.txt 中的數據
        double[] qData = readData("qdata.txt");

        // 建立並啟動 bubbleSort 的執行緒
        BSort bSort = new BSort(bData);
        bSort.start();
        // 建立並啟動 quickSort 的執行緒
        QSort qSort = new QSort(qData);
        qSort.start();
    }
    public static void generateRandomData(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            Random random = new Random();
            for (int i = 0; i < 100000; i++) {
                double randomNumber = random.nextDouble() * 10000; // 產生 0 到 10000 之間的亂數
                writer.write(Double.toString(randomNumber) + "\n"); // 寫入文件
            }
            writer.close();
            System.out.println("已將十萬筆亂數存入 " + filename);
        } catch (IOException e) {
            System.out.println("寫入文件時出現錯誤：" + e.getMessage());
        }
    }
    public static double[] readData(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            double[] data = new double[100000];
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                data[i++] = Double.parseDouble(line);
            }
            reader.close();
            return data;
        } catch (IOException e) {
            System.out.println("讀取文件時出現錯誤：" + e.getMessage());
            return null;
        }
    }
}
