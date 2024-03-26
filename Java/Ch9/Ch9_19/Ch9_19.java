class Data {
    private String name;
    private Test score;
    //a
    class Test {
        int english;
        int math;
        //b
        Test(int eng, int ma) {
            english = eng;
            math = ma;
        }
        //c
        double avg() {
            return (english+math)/2;
        }
    }
    //d
    Data(String na, int eng, int ma) {
        name = na;
        score = new Test(eng, ma);
    }
    //e
    void show() {
        System.out.println("Name : " + name);
        System.out.println("English : " + score.english);
        System.out.println("Math : " + score.math);
        System.out.println("Average : " + score.avg());
    }

}
public class Ch9_19 {
    public static void main(String[] args) {
        Data stu = new Data("Annie", 85, 92);
        stu.show();
    }
}