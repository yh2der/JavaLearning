public class Ch7_23 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5},
            {8, 9, 2}
        };
        square(arr);
        for (int[] i : arr) {
            for (int ii : i) {
                System.out.println(ii);
            }
        }
    }
    static void square(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                arr[i][j] *= arr[i][j];
            }
        }
    }
}