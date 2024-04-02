class Triangle {
    protected int base;   
    protected int height;
    
    protected void show() {
        System.out.println("base = " + base + ", height = " + height);
    }     
}
//a
class Data extends Triangle {
    Data (int ba, int hei) {
        base = ba;
        height = hei;
    }
    //b
    void area() {
        show();
        System.out.printf("三角形面積 = %d", base*height/2);
    }
}
public class Ch10_5 {
    public static void main(String[] args) {
        Data obj=new Data(3,8);
        obj.area();
    }
} 