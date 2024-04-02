class Caaa {}
class Cbbb extends Caaa {}
class Cccc extends Cbbb {}
public class Ch10_8 {
   public static void main(String[] args) {
        Cbbb b1=new Cbbb(); //正確
        Cbbb b2=new Cccc(); //正確
        Cccc c1=new Caaa(); //錯誤 Caaa不是Cccc的子類別
        Cccc c2=new Cbbb(); //錯誤 Cbbb不是Cccc的子類別
   }
}
