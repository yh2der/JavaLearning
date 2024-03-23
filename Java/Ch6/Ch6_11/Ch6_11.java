public class Ch6_11 {
    public static void main(String[] args) {
        float[][] temp = {
            {18.2F, 17.3F, 15.0F, 13.4F},
            {23.8F, 25.1F, 20.6F, 17.8F},
            {20.6F, 21.5F, 18.4F, 15.7F}
        };
        //a
        for (float f[] : temp) {
            for (float ff : f) {
                System.out.printf("%f ", ff);
            }
            System.out.println();
        }
        System.out.println();

        //b
        for (int i=0; i<temp[0].length; i++) {
            float avg = 0;
            for (int j=0; j<temp.length; j++) {
                avg += temp[j][i];
            }
            System.out.printf("%f ", avg/3);
        }
        System.out.println();
        //c
        float avg = 0;
        for (int i=0; i<temp.length; i++) {
            for (int j=0; j<temp[0].length; j++) {
                avg += temp[i][j];
            }
            System.out.println();
        }

        //d
        float max = 0.0f;
        int day = 0, time = 0;
        for (int i=0; i<temp.length; i++) {
            for (int j=0; j<temp[0].length; j++) {
                max = temp[i][j];
                day = j+1;
                time = i+1;
            }
        }
        System.out.printf("溫度最高的日子星期 %d 時段 %d 溫度 %f", day, time, max);
        System.out.println();

        //e
        float min = 1000.0f;
        day = 0;
        time = 0;
        for (int i=0; i<temp.length; i++) {
            for (int j=0; j<temp[0].length; j++) {
                if (temp[i][j] < min) {
                    min = temp[i][j];
                    day = j+1;
                    time = i+1;
                }
            }
        }
        System.out.printf("溫度最低的日子星期 %d 時段 %d 溫度 %f", day, time, min);
        System.out.println();
    }
}
