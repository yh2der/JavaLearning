public class Ch6_4 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 0, 3, 2, 4, 1, 6, 8, 5, 4, 3, 2};

        System.out.println(arr.length);

        int count = 0;
        for (int i : arr) {
            if (i>=3 && i<= 6) {
                count++;
            }
        }
        System.out.println(count);
    }
}