public class Ch12_22 { 
    public static double cal(double a, double b) {
        return Math.sin(a) + Math.cos(b);
    }   
    public static void main(String[] args) {
        System.out.println(cal(Math.PI/6, Math.PI/3));

    }
}