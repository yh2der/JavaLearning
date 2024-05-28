import java.util.HashMap;
public class Ch16_12 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(95, "Ryan");
        hmap.put(83, "Fiona");
        hmap.put(89, "Jack");
        hmap.put(76, "Kevin");
        hmap.put(92, "Ariel");
        System.out.println(hmap);
        // (b) 計算 Ariel 與 Fiona 的英文成績平均值
        int arielScore = 92;
        int fionaScore = 83;
        double averageArielFiona = (arielScore + fionaScore) / 2.0;
        System.out.println("Ariel 與 Fiona 的英文成績平均值為: " + averageArielFiona);

        // (c) 計算 Kevin 與 Jack 的英文成績相差
        int kevinScore = 76;
        int jackScore = 89;
        int scoreDifference = Math.abs(kevinScore - jackScore);
        System.out.println("Kevin 與 Jack 的英文成績相差: " + scoreDifference);
    }
}