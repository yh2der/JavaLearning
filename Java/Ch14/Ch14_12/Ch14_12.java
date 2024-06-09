import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Ch14_12 {
    public static void main(String[] args) throws IOException {
        writeData();
        findMinMaxAvg();
        sortData();
    }

    public static void writeData() throws IOException {
        FileOutputStream fos = new FileOutputStream("rand.txt");
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt(99999) + 1;
            String numString = Integer.toString(num);
            fos.write(numString.getBytes());
            fos.write("\n".getBytes());
        }
        fos.close();
    }

    public static void findMinMaxAvg() throws IOException {
        int[] numbers = new int[1000];
        FileInputStream fis = new FileInputStream("rand2.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        String line;
        int index = 0;
        while ((line = br.readLine()) != null) {
            numbers[index++] = Integer.parseInt(line);
        }
        br.close();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        double average = (double) sum / numbers.length;
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }

    public static void sortData() throws IOException {
        int[] numbers = new int[1000];
        FileInputStream fis = new FileInputStream("rand.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        int index = 0;
        while ((line = br.readLine()) != null) {
            numbers[index++] = Integer.parseInt(line);
        }
        br.close();
        Arrays.sort(numbers);
        try (FileOutputStream fos = new FileOutputStream("rand2.txt")) {
            for (int num : numbers) {
                String numString = Integer.toString(num);
                fos.write(numString.getBytes());
                fos.write("\n".getBytes());
            }
        }
    }
}
