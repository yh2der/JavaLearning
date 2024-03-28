class Cddd {
    String name;
    double height, weight;
}
public class Ch8_3 {
    public static void main(String[] args) {
        //a
        Cddd student = new Cddd();
        //b
        student.name = "Sandy";
        student.height = 1.655;
        student.weight = 58.2;
        //c
        double BMI = student.weight/(student.height*student.height);
        System.out.println(BMI);
    }
}