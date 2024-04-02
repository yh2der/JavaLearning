class Car {
    String owner = "Tom";
    final String color = "Red";
    final void show() {
        System.out.println("Color:" + color + " Owner:" + owner);
    }
}
class Truck extends Car {
    Truck() {

    }
}
public class Ch10_14 {
    public static void main(String[] args) {
        Truck tr = new Truck();
        System.out.println(tr.owner="HOWARD");
        //System.out.println(tr.color="BLUE"); //可引用但不能梗改內容
        tr.show();
    }
}