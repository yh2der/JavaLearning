public class Ch7_17 {
    public static void main(String[] args) {
        int[] arr = {75, 29, 38, 45, 16};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int min = 11111111;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}