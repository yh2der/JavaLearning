public class MT_7 {
    public static void main(String[] args) {
        String[] fruits = {"水果A", "水果B", "水果C", "水果D", "水果E"};
        String[] time = {"早上", "下午", "晚上"};
        int[][] prices = {
            {68, 45, 56, 85, 76},
            {77, 63, 65, 45, 23},
            {43, 55, 97, 78, 61}
        };
        System.out.printf("\t");
        for (int i=0; i<fruits.length; i++) {
            System.out.printf("%s\t", fruits[i]);
        }
        System.out.println();
        for (int i=0; i<prices.length; i++) {
            System.out.printf("%s\t", time[i]);
            for (int j=0; j<prices[i].length; j++) {
                System.out.printf("%d\t", prices[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //a
        int[] total = new int[3];
        for (int i=0; i<prices.length; i++) {
            for (int j=0; j<prices[i].length; j++) {
                total[i] += prices[i][j];
            }
            System.out.println(time[i] + "\t" + total[i]);
        }
        System.out.println();
        //b
        int[] total_f = new int[5];
        
        for (int j=0; j<prices[0].length; j++) {
            for (int i=0; i<prices.length; i++) {
                total_f[j] += prices[i][j]; 
            }
            System.out.println(fruits[j] + "\t" + total_f[j]);
        }
        
        //c
        int index = 0, max = 0;
        for (int i=0; i<3; i++) {
            if (total[i] > max) {
                max = total[i];
                index = i;
            }
        }
        System.out.println("業績最好:" + time[index]);
        System.out.println();

        //d
        int index2 = 0, max_f = 0;
        for (int i=0; i<5; i++) {
            if (total_f[i] > max_f) {
                max_f = total_f[i];
                index2 = i;
            }
        }
        System.out.println("總金額最多的水果 " + fruits[index2]);
    }
}