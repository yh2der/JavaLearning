public class Ch6_3 {
    public static void main(String[] args) {
        int[] arr = {53, 27, 69, 12, 3, 96};

        //a
        for (int i : arr) {
            System.out.println(i + " ");
        }

        //b
        int odd = 0, even = 0;
        for (int i : arr) {
            if (i%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.printf("odd : %d, even : %d", odd, even);
        System.out.println();

        //c
        int max =  1;
        for (int i : arr) {
            if (i%2 == 1 && i > max) {
                max = i;
            }
        }
        System.out.println(max);

        //d
        int max_even = 0;
        for (int i : arr) {
            if (i%2 == 0 && i > max) {
                max_even = i;
            }
        }
        System.out.println();
    }
}