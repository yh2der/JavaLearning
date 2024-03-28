class CBox {
    int length;
    int width;
    int height;
    //b
    int volume() {
        return length * width * height; 
    }
    //c
    int surfaceArea() {
        return length*width + length*height + width*height;
    }
    //d
    void showData() {
        System.out.printf("length = %d\nwidth = %d\nheight = %d\n",
                            length, width, height);
    }
    //e
    void showAll() {
        showData();
        System.out.printf("表面積 = %d\n體積 = %d",
                            surfaceArea(), volume());
    }
}
public class Ch8_5 {
    public static void main(String[] args) {
        //a
        CBox box = new CBox();
        box.height = 1;
        box.length = 1;
        box.width = 1;
        //f
        box.showAll();
    }
}
