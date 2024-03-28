public class Ch7_32 {
    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(2.3f));
    }
    static int area(int a) {
        return 3*a*a;
    }
    static float area(float a) {
        return 3.14f*a*a;
    } 
    
}