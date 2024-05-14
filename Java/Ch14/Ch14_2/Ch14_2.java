import java.util.Scanner;

public class Ch14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個字串: ");
        String inputString = scanner.nextLine();

        String upperCaseString = inputString.toUpperCase();

        System.out.println("轉換後的字串為: " + upperCaseString);

        scanner.close();
    }
}
