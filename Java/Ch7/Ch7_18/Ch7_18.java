public class Ch7_18 {
    public static void main(String[] args) {
        int[] arr = {75, 29, 38, 45, 16};
        System.out.println(argmin(arr));
    }
    static int argmin(int[] arr) {
        int min = 11111111;
        int arg = 0;
        for (int i=0; i<arr.length; i++) {
            if (i < min) {
                min = arr[i];
                arg = i;
            }
        }
        return arg;
    }
}