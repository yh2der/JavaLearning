public class Ch4_7 {
    public static void main(String[] args) {
        //a
        int a = 10, b = 5;
        b *= a;
        System.out.printf("a = %d, b = %d\n", a, b);
        //b
        a = 10;
        b = 5;
        a /= b++;
        System.out.printf("a = %d, b = %d\n", a, b);
        //c
        a = 10;
        b = 5;
        a /= ++b;
        System.out.printf("a = %d, b = %d\n", a, b);
        //d
        a = 10;
        b = 5;
        a %= --b;
        System.out.printf("a = %d, b = %d\n", a, b);
        //e
        a = 10;
        b = 5;
        b %= a++;
        System.out.printf("a = %d, b = %d\n", a, b);
    }
}