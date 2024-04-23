// Ex11_3, 抽象類別
abstract class Shape {
    protected int width;
    protected int height; 
    public void show() {
        System.out.println("width="+width);
        System.out.println("height="+height);
        System.out.println("area="+area());
    }
    public abstract int area();    // 計算面積  
}
class Win extends Shape {      
    // 請完成這個部分的程式碼
    Win(int a, int b) {
        width = a;
        height = b;
    }
    public int area() {
        return width*height;
    }
}
public class Ch11_3 {
    public static void main(String args[]) {
        Win w=new Win(5,7); 	// 建立Win類別的物件
        w.show();
    }
}
