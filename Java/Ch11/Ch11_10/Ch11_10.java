// Ex11_10
interface Data {   
    public void best();			// 判斷那一科成績較高
    public void failed();  		// 判斷那一科成績低於60分
}
interface Test extends Data {
    public void showData();		// 顯示學生的資料及平均成績
    public double average();		// 計算數學和英文的平均成績
}
class Stu implements Test {
    protected String name;  		// 姓名 
    protected int math;     		// 數學成績
    protected int english;  		// 英文成績
        
    // 請完成這個部分的程式
    Stu(String n, int m, int e) {
        name = n;
        math = m;
        english = e;
    }
    public void showData() {
        System.out.println("name " + name);
        System.out.println("math " + math);
        System.out.println("english " + english);
        System.out.println("average" + average());
    }	// 顯示學生的資料及平均成績
    public double average() {
        return (math+english)/2.0;
    }		// 計算數學和英文的平均成績
    public void best() {
        if (math > english) {
            System.out.println("math比較高");
        } else {
            System.out.println("english比較高");
        }
    }			// 判斷那一科成績較高
    public void failed() {
        if (math<60)    System.out.println("math failed");
        if (english<60) System.out.println("english failed");
    }  		// 判斷那一科成績低於60分
    public void show() {
        showData();
        best();
        failed();
    }
}

public class Ch11_10 {
    public static void main(String[] args){
        Stu s=new Stu("Judy",58,91);          
        s.show();
    }
}
