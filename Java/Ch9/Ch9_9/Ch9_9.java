class MyClip {
    static int low;
    static int high;
    MyClip(int lo, int hi) {
        low = lo;
        high = hi;
    }
    //a
    void set_range(int lo, int hi) {
        low = lo;
        high = hi;
    }
    //b
    void clip(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            if (arr[i] > high) {
                arr[i] = high;
            }
            if (arr[i] < low) {
                arr[i] = low;
            }
        }
    }
    //c
    void print_arr(int[] ar) {
        int n = ar.length;
        for (int i=0; i<n; i++) {
            System.out.printf("%d ", ar[i]);
        }
        System.out.println();
    }
}
public class Ch9_9 {
    public static void main(String[] args) {
        int[] a={-4,190,300,12,-7,8};
        int[] b={0,2,4,3,6,7};
        MyClip obj = new MyClip(0,255);
        obj.clip(a);
        obj.print_arr(a);
        obj.set_range(3,5);
        obj.clip(b);
        obj.print_arr(b);
    }
}