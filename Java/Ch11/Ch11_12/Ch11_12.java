// Ex11_12
interface iVolume {
    public void showData();    		// 顯示球體的資料
    public double vol();       		// 計算球體積
}
abstract class Sphere implements iVolume {   
    final double PI=3.14;
    protected int x;
    protected int y;
}
class Circle extends Sphere {    
    // 請完成這個部分的程式碼
    int radius;
    Circle(int a, int b, int r) {
        x = a;
        y = b;
        radius = r;
    }
    public void showData() {
        System.out.println("球心:(" + x + ", " + y + ")");
        System.out.println("半徑" + radius);
        System.out.println("體積" + vol());
    }    		// 顯示球體的資料
    public double vol() {
        return 4*PI*radius*radius*radius/3;
    }      		// 計算球體積
}

public class Ch11_12{
    public static void main(String[] args) {
        Circle c1 = new Circle(8,6,2);          
        c1.showData();
    }
}
