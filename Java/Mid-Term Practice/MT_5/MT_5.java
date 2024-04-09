public class MT_5 {
    public static void main(String[] args) {
        //long記得L
        long num = 123456456952L;
        int[] count = new int[10];
        while (num > 0) {
            long temp = num % 10;
            //注意switch傳入值 long不可以
            switch((int)temp) {
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
                case 6:
                    count[6]++;
                    break;
                case 7:
                    count[7]++;
                    break;
                case 8:
                    count[8]++;
                    break;
                case 9:
                    count[9]++;
                    break;
                default:
                    break;
            }
            num /= 10;
        }
        for (int i=0; i<10; i++) {
            System.out.println(i + "出現" + count[i] + "次");
        }
    }
}