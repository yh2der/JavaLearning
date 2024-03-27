public class Ch6_14 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                int temp = arr[i][j];
                System.out.printf("%d ", temp*temp);
            }
            System.out.println();
        }
    }
}