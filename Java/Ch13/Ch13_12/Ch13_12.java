class CenterException extends Exception {
    public CenterException(String message) {
        super(message);
    }
}

class OutException extends Exception {
    public OutException(String message) {
        super(message);
    }
}

class InException extends Exception {
    public InException(String message) {
        super(message);
    }
}

public class Ch13_12 {
    public static void main(String args[]) {
        double radius = 10.0;
        double x1 = 5.3;
        double y1 = 6.8;
        double x2 = 0.2;
        double y2 = 9.5;

        try {
            double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

            if (dist == 0) {
                throw new CenterException("在半徑" + radius + ",圓心(" + x2 + "," + y2 + ")的圓心上");
            } else if (dist > radius) {
                throw new OutException("不在半徑" + radius + ",圓心(" + x2 + "," + y2 + ")的圓內");
            } else {
                throw new InException("在半徑" + radius + ",圓心(" + x2 + "," + y2 + ")的圓內");
            }
        } catch (CenterException e) {
            System.out.println(e.getMessage());
        } catch (OutException e) {
            System.out.println(e.getMessage());
        } catch (InException e) {
            System.out.println(e.getMessage());
        }
    }
}
