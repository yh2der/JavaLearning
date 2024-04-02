//a
class Caaa {
    void display() {
        System.out.println("printed from Caaa class");
    }
}
//b
class Cbbb extends Caaa {
    void display() {
        System.out.println("printed from Cbbb class");
    }
}
public class Ch10_7 {
    public static void main(String[] args) {
        Caaa bb = new Cbbb(); 
        bb.display();
    }
}