import java.util.Scanner;
public class Ch5_29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int chance = 3, pwd = 0;
        while (chance > 0) {
            System.out.println("請輸入密碼");
            pwd = scn.nextInt();
            if (pwd == 6128) {
                System.out.println("密碼輸入正確，歡迎使用本系統");
            }
            else {
                System.out.println("密碼輸入錯誤，請重新輸入密碼");
            }
            chance--;
        }
        if (chance == 0)
            System.out.println("密碼輸入超過三次");
        scn.close();
    }
}