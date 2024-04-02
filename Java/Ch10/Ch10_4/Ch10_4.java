class Caaa{
    private int num;
    
    public Caaa(int n) {
        num=n;
    }
    public int get() {
        return num;
    }
}
class Cbbb extends Caaa	{
    Cbbb(int a) {
        super(a);
    }
    public void show() { 
        System.out.println("num = " + get()); 
    }
}
public class Ch10_4 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2); 
        bb.show();	
    }
}  
