import java.util.Scanner;
public class MT_6 {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday",
                         "Friday", "Saturday", "Sunday"};
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        System.out.println(week[input-1]);
    }
}