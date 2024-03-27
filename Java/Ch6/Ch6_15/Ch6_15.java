public class Ch6_15 {
    public static void main(String[] args) {
        int[][] arr = {
            {4, 2},
            {3, 4, 6},
            {7, 4, 8, 5}
        };
        int max = 0;
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        System.out.println(max);
    }
}