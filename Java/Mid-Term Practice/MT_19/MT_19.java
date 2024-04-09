//a
class Volume {
    void show() {
        System.out.println("printed from class volume");
    }
    //b
    int vol() {
        return 1;
    }
}
//c
class Box extends Volume {
    int length;
    int width;
    int height;
    //e
    Box() {
        length = 1;
        width = 1;
        height = 1;
    }
    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
    void show() {
        System.out.println("Length= " + length +
                           "\nWidth= " + width +
                           "\nHeight= " + height);
    }
    //d
    int vol() {
        return length*width*height;
    }
}
public class MT_19 {
    public static void main(String[] args) {
        //f
        Box box1=new Box(2,3,4);
        Box box2=new Box();
        box1.show();
        box2.vol();
        box2.show();
        box2.vol();
    }
}