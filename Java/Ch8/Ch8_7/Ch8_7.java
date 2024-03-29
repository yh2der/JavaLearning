class CTest {
    void test(int num) {
        if (num == 0) {
            System.out.println("此數為0");
        }
        else if (num%2 == 1) {
            System.out.println("奇數");
        }
        else {
            System.out.println("偶數");
        }
    }
}
public class Ch8_7 {
    public static void main(String[] args) {
        CTest t = new CTest();
        t.test(0);
        t.test(1);
        t.test(2);
    }
}