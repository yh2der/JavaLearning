class Hello {
    //a
    String name;
    //b
    void say_hi() {
        System.out.println("Hi, everyone");
    }
    //c 
    void say_hi(String str) {
        name = str;
        System.out.println("Hi, " + name);
    }
}
public class MT_18 {
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.say_hi("howard");
    }
}