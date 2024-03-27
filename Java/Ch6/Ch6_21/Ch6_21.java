public class Ch6_21 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={9,8,7,6};
        for (int i=0; i<a.length; i++) {
            int temp;
            temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i);
        }
    }
}