public class Ch7_31 {
    public static void main(String[] args) {
        int[] a = {12, 7, 32, 67};
        System.out.println(smallest(8, 9));
        System.out.println(smallest(a));
    }
    static int smallest(int a, int b) {
        if (a > b) {
            return b;
        }
        else {
            return a;
        }
    }
    static int smallest(int[] a) {
        int min = 111111111;
        for (int i=0; i<a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}