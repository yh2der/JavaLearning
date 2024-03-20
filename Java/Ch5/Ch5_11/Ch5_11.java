import java.util.Scanner;
public class Ch5_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();

        if (day>=1 && day<=5) {
            System.out.println("今天要上班上課");
        }
        else if (day>=6 && day<=7) {
            System.out.println("今天休息");
        }
        else {
            System.out.println("輸入錯誤");
        }
        scn.close();
    }
}