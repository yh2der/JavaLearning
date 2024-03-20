import java.util.Scanner;
public class Ch5_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char ch = str.charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("此字元是數字");
        }
        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
            System.out.println("此字元是英文字母");
        }
        scn.close();
    }
}