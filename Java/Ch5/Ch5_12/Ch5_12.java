import java.util.Scanner;
public class Ch5_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        switch (num) {
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("冬天");
                break;
            default:
                System.out.println("月份不存在");
        }
        scn.close();
    }
}