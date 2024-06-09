import java.io.*;

import java.io.*;

class Car {
    public String module;
    public String color;
    public int price;
    
    Car(String m, String c, int p) {
        module = m;
        color = c;
        price = p;
    }
    
    public void writeData(Car c1, Car c2) throws IOException {
        FileOutputStream fos = new FileOutputStream("mycar.txt");
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(fos));
        bfw.write(c1.module + "," + c1.color + "," + c1.price);
        bfw.newLine();
        bfw.write(c2.module + "," + c2.color + "," + c2.price);
        bfw.close();
    }
    
    public void show() {
        System.out.println("車款: " + module);
        System.out.println("顏色: " + color);
        System.out.println("車價: " + price);
    }
}

public class Ch14_13 {
    public static void main(String[] args) throws IOException {
        Car c1 = new Car("C 300 Estate", "white", 297);
        Car c2 = new Car("5-Series Sedan M5", "black", 716);
        c1.writeData(c1, c2);
        readData();
    }
    
    public static void readData() throws IOException {
        FileInputStream fis = new FileInputStream("mycar.txt");
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
        String line;
        while ((line = bfr.readLine()) != null) {
            String[] data = line.split(",");
            Car car = new Car(data[0], data[1], Integer.parseInt(data[2]));
            car.show();
            System.out.println();
        }
        bfr.close();
    }
}