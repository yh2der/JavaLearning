public class Ch6_7 {
    public static void main(String[] args) {
        int arr[] = {12, 15, 8, 43};
        int start = 0, end = arr.length-1;
        while (start < end) {
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}