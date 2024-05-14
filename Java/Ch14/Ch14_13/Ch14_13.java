import java.io.*;

class Car {
    public String module;
    public String color;
    public int price;

    public Car(String m, String c, int p) {
        module = m;
        color = c;
        price = p;
    }

    public void writeData(FileOutputStream fos) throws IOException {
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(module);
        dos.writeUTF(color);
        dos.writeInt(price);
        dos.flush();
    }

    public void show() {
        System.out.println("車款: " + module);
        System.out.println("顏色: " + color);
        System.out.println("車價: " + price);
    }    
}
public class Ch14_13 {
    public static Car readData(FileInputStream fis) throws IOException {
        DataInputStream dis = new DataInputStream(fis);
        String m = dis.readUTF();
        String c = dis.readUTF();
        int p = dis.readInt();
        return new Car(m, c, p);
    }

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("mycar.txt");
            Car c1 = new Car("C 300 Estate", "white", 297);
            Car c2 = new Car("5-Series Sedan M5", "black", 716);
            c1.writeData(fos);
            c2.writeData(fos);
            fos.close();

            FileInputStream fis = new FileInputStream("mycar.txt");
            c1 = readData(fis);
            c2 = readData(fis);
            fis.close();

            c1.show();
            c2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}