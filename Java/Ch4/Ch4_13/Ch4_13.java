import java.util.Scanner;
public class Ch4_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double r = scn.nextDouble();
        System.out.println(r*r*r*4/3 + "\u03c0");
        scn.close();
    }
}