public class MT_14 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] ans = combine(a, b);
        for (int i : ans) {
            System.out.println(i);
        }
    }
    static int[] combine(int a[], int b[]) {
        int len = a.length + b.length;
        int[] result = new int[len];
        for (int i=0; i<a.length; i++) {
            result[i] = a[i];
        }
        for (int i=a.length; i<len; i++) {
            result[i] = b[i%b.length];
        }
        return result;    
    }
}