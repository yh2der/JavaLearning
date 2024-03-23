public class Ch6_10 {
    public static void main(String[] args) {
        char arr[] = {'H', 'e', 'l', 'l', 'o'};
        for (char ch : arr) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 'a' + 'A');
            }
            System.out.println(ch);
        }
    }
}
