import java.util.Scanner;
public class MT_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] coin = new int[6];
        String[] paper = {"$500", "$100", "$50", "$10", "$5", "$1"};
        System.out.println("購買價格:");
        int price = scn.nextInt();
        System.out.println("付款:");
        int paid = scn.nextInt();
        int change = paid - price;
        while (change > 0) {
            if (change >= 500) {
                coin[0] = change / 500;
                change %= 500;
            } else if (change >= 100) {
                coin[1] = change / 100;
                change %= 100;
            } else if (change >= 50) {
                coin[2] = change / 50;
                change %= 50;
            } else if (change >= 10) {
                coin[3] = change / 10;
                change %= 10;
            } else if (change >= 5) {
                coin[4] = change / 5;
                change %= 5;
            } else if (change >= 1) {
                coin[5] = change / 1;
                change %= 1;
            }
        }
        for (int i=0; i<6; i++) {
            System.out.println(paper[i] + '=' + coin[i]);
        }
    }
}