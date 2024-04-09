public class MT_8 {
    public static void main(String[] args) {
        int row = 0, col = 0, max = 0;
        int[][] matrix = {
            {37, 16, 43},
            {12, 18, 94}
        };
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("第" + row + "列" + "第" + col + "行");
    }
}