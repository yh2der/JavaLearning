class MinMax{
    private int[] arr;
    //a
    MinMax(int[] a) {
        arr = a;
    }
    //b
    void find_min_max() {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = temp;
                }
            }
        }
        System.out.printf("min : %d, max : %d", arr[0], arr[n-1]);
    }
}
public class Ch9_4 {
    public static void main(String[] args) {
        int[] a={12,54,23,17,90};
        MinMax obj=new MinMax(a);
        obj.find_min_max();
    }
}
