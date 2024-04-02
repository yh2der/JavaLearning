class Rectangle {
    protected int width;   
    protected int height;
    //a
    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    //c
    public String toString() {
        String str = "width = " + width + " height = " + height + " area = " + (width*height);
        return str;
    }
}
public class Ch10_16 {
    public static void main(String[] args) {
        //b
        Rectangle rect = new Rectangle(20, 60);
        //c
        System.out.println(rect);
    }
}