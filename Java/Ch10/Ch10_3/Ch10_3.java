class Rectangle{
    private int length;
    private int width;
    
    //a
    Rectangle() {
        length = 2;
        width = 2;
    }
    Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }
    private void show() {
        System.out.print("length=" + length);
        System.out.print(", width=" + width);
    }
    int getLen() {
        return length;
    }
    int getWid() {
        return width;
    }
}
//b
class Data extends Rectangle {
    Data() {

    }
    Data(int len, int wid) {
        super(len, wid);
    }
    void area() {
        System.out.printf("長方形面積 = %d\nlength = %d\nwidth = %d",
                            getLen()*getWid(), getLen(), getWid());
    }
}
public class Ch10_3 {
    public static void main(String[] args) {
        Data obj1 = new Data(3,8);
        Data obj2 = new Data();
        obj1.area();
        obj2.area();
    }
}