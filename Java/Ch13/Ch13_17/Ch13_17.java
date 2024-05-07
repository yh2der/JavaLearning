import java.util.Scanner;
class IntegerLessThanZero extends Exception {
    public IntegerLessThanZero(String s) {
        super(s);
    }
}
class IntegerGreaterThanZero extends Exception {
    public IntegerGreaterThanZero(String s) {
        super(s);
    }
}
class IntegerEqualToZero extends Exception {
    public IntegerEqualToZero(String s) {
        super(s);
    }
}
public class Ch13_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個整數: ");
        try {
            int input = scanner.nextInt();
            if (input < 0) {
                throw new IntegerLessThanZero("您輸入的整數的值小於0");
            } else if (input > 0) {
                throw new IntegerGreaterThanZero("您輸入的整數的值大於0");
            } else {
                throw new IntegerEqualToZero("您輸入的整數的值等於0");
            }
        } catch (IntegerLessThanZero e) {
            System.out.println(e.getMessage());
        } catch (IntegerGreaterThanZero e) {
            System.out.println(e.getMessage());
        } catch (IntegerEqualToZero e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("輸入的不是整數");
        }
    }
}
