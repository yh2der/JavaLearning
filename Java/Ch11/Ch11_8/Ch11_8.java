// Ex11_8, 多重繼承的練習
interface Data {   
    public void show();   
}
interface Test {
    public void showScore();
    public double calcu();
}
// 請完成這個部分的程式
class Stu implements Data, Test {
    protected String id;    	// 學號
    protected String name;  	// 姓名 
    protected int mid;      	// 期中考成績
    protected int finl;     	// 期末考成績
    protected int common;   	// 平時成績
    Stu(String i, String n, int m, int f, int c) {
        id = i;
        name = n;
        mid = m;
        finl = f;
        common = c;
    }
    public void showScore() {
        System.out.println("期中" + mid);
        System.out.println("期末" + finl);
        System.out.println("平時" + common);
    }
    public double calcu() {
        return mid*0.3 + finl*0.3 + common*0.4;
    }
    public void show() {
        System.out.println("id " + id);
        System.out.println("name" + name);
        System.out.println("期中" + mid);
        System.out.println("期末" + finl);
        System.out.println("總成績" + calcu());
    }
}

public class Ch11_8 {
    public static void main(String args[]) {
        Stu stu = new Stu("940001","Fiona",90,92,85);
        stu.show();
    }
}
