class TriangleException extends Exception {
    public TriangleException(String message) {
        super(message);
    }
}

class NotTriangle extends TriangleException {
    public NotTriangle() {
        super("不構成三角形");
    }
}

class EquilateralTriangle extends TriangleException {
    public EquilateralTriangle() {
        super("這是正三角形");
    }
}

class NotEquilateralTriangle extends TriangleException {
    public NotEquilateralTriangle() {
        super("這不是正三角形");
    }
}

public class Ch13_14 {
    public static void main(String[] args) {
        try {
            triangle(3, 3, 3);
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void triangle(int a, int b, int c) throws TriangleException {
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a)
            throw new NotTriangle();
        else if (a == b && a == c && b == c)
            throw new EquilateralTriangle();
        else
            throw new NotEquilateralTriangle();
    }
}
