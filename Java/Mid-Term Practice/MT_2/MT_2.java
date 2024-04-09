import java.util.Scanner;
public class MT_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        double y = scn.nextDouble();
        if (x > 0.0) {
            if (y == 0.0) {
                System.out.println("X軸");
            } else if (y > 0.0) {
                System.out.println("第一象限");
            } else {
                System.out.println("第四象限");
            }
        } else if (x < 0.0) {
            if (y == 0.0) {
                System.out.println("X軸");
            } else if (y > 0.0) {
                System.out.println("第二象限");
            } else {
                System.out.println("第三象限");
            }
        } else {
            if (y == 0.0) {
                System.out.println("原點");
            } else {
                System.out.println("Y軸");
            }
        }
    }
}