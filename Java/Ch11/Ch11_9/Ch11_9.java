// Ex11_9, 多重繼承的練習
interface iShape {   
    public void show();  
    public int area(); 
}
interface iColor {
   public void showColor();
}

class Win implements iShape, iColor {
    // 請完成這個部分的程式碼
    int width;
    int height;
    String color;
    Win(int w, int h, String s) {
        width = w;
        height = h;
        color = s;
    }
    public void show() {
        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println("color = " + color);
        System.out.println("area = " + area());
    }
    public int area() {
        return width*height;
    }
    public void showColor() {
        System.out.println("color = " + color);
    }
}
public class Ch11_9 {
    public static void main(String args[]) {
        Win w=new Win(5,7,"Green");
        w.show();
    }
}