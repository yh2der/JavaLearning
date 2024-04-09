public class MT_3 {
    public static void main(String[] args) {
        int num = 50;
        int sum = 0;
        for (int i=1; i<num+1; i++) {
            if (i % 2 == 1) {
                sum += i*i;
            } else {
                sum -= i*i;
            }
        }
        System.out.println(sum);
    }
}