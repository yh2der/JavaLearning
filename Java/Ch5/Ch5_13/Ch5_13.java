import java.util.Scanner;
public class Ch5_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char ch = str.charAt(0);

        switch (ch) {
            case '貓':
                System.out.println("喵喵叫");
                break;
            case '狗':
                System.out.println("汪汪叫");
                break;
            case '羊':
                System.out.println("咩咩叫");
                break;
            default:
                System.out.println("不明動物");
                break;
        }
        scn.close();
    }
}