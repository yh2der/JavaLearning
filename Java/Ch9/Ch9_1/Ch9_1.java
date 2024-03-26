class Rectangle {
    int width;
    int height;
    //b
    Rectangle() {
        width = 1;
        height = 1;
    }
    //a
    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    //c
    void show() {
        System.out.printf("width : %d, height : %d\n", width, height);
    }
}
public class Ch9_1 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Rectangle rec2 = new Rectangle(2, 2);
        rec.show();
        rec2.show();
    }
}