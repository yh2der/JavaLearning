import java.util.Scanner;

class Exception520 extends Exception {
    public Exception520() {
        super();
    }
}

public class Ch13_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個字串: ");
        String input = scanner.nextLine();

        try {
            checkInput(input);
        } catch (Exception520 e) {
            System.out.println("這是由字串520所引起的例外");
        }
    }

    public static void checkInput(String input) throws Exception520 {
        if (input.equals("520")) {
            throw new Exception520();
        } else {
            System.out.println("輸入的字串為: " + input);
        }
    }
}


