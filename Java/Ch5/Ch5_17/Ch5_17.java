public class Ch5_17 {
    public static void main(String[] args) {
        int num = 89;
        boolean flag = true;

        for (int i=1; i<=num; i++) {
            if (num%i == 0 && i != 1 && i != num) {
                flag = false;
                System.out.println(i);
                break;
            }
        }
        if (!flag) {
            System.out.println("不是prime");
        }
        else {
            System.out.println("是prime");
        }
    }
}