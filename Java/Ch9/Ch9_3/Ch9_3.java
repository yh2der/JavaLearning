class Caaa {   // 定義類別Caaa
    private int value;
    //a
    public Caaa(){   
            this(1);
    }   
    public Caaa(int i){   
        value = i;
    }      
    //b
    void set_value(int n) {
        value = n;
    }
    int get_value() {
        return value;
    }
}
public class Ch9_3 {
    public static void main(String[] args) {
        Caaa obj1 = new Caaa();
        Caaa obj2 = new Caaa(12);
        System.out.println(obj1.get_value());
        System.out.println(obj2.get_value());
        obj2.set_value(11);
        System.out.println(obj2.get_value());
    }
} 
