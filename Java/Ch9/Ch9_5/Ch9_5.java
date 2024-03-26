class Average {
    private int[][] arr;
    private double avg;
    //a
    Average(int [][] a) {
        arr = a;
        int count = 0;
        for (int[] aa : arr) {
            for (int aaa : aa) {
                count++;
                avg += aaa;
            }
        }
        avg /= count;
    }
    //b
    void print_avg() {
        System.out.println(avg);
    }
    //c
    void print_arr() {
        for (int[] aa : arr) {
            for (int aaa : aa) {
                System.out.printf("%d ", aaa);
            }
            System.out.println();
        }
    }
}
public class Ch9_5 {
    public static void main(String[] args) {
        int[][] a={
            {12,54,23},
            {21,12,25}
            };
        Average obj=new Average(a);
        obj.print_avg();
        obj.print_arr();
    }
}