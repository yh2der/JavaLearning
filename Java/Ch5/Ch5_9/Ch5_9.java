import java.util.Scanner;
public class Ch5_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if (num>=80 && num<=100) {
            System.out.println("A級");
        }
        if (num>=60 && num<=79) {
            System.out.println("B級");
        }
        if (num <59) {
            System.out.println("C級");
        }
        scn.close();
    }    
}
