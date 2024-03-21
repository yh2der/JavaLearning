public class Ch5_25 {
    public static void main(String[] args) {
        //a
        int c = 1;

        for (int i=1; i<6; i++) {
            c = 1;
            for (int j=1; j<6; j++) {
                if (j <= i) {
                    System.out.printf("%d", c);
                    c++;
                }                
            }
            System.out.printf("\n");
        }
        System.out.println();

        //b
        c = 5;
        for (int i=1; i<6; i++) {
            for (int j=1; j<6; j++) {
                if (j <= i) {
                    System.out.printf("%d", c);
                }
            }
            System.out.println();
        }
        System.out.println();

        //c
        c = 0;
        for (int i=1; i<6; i++) {
            c += 1;
            for (int j=1; j<6; j++) {
                if (j <= i) {
                    System.out.printf("%d", c);
                }
            }
            System.out.println();
        }
        System.out.println();

        //d
        String str = "0123456789abcde";
        c = 0;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j <= i) {
                    System.out.printf("%c", str.charAt(c));
                    c++;
                }                
            }
            System.out.println();
        }
    }
}