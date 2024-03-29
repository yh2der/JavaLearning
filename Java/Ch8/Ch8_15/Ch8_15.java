class CSphere {
    private int x;    	// 圓心的x座標
    private int y;    	// 圓心的y座標
    private int z;    	// 圓心的z座標
    private int r; 		// 圓球的半徑r
    //a
    void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //b
    void setRadius(int r) {
        this.r = r;
    }
    //c
    double surfaceArea() {
        return 4*3.14*r*r*r;
    }
    //d
    double volume() {
        return 4*3.14*r*r*r/3;
    }
}
public class Ch8_15 {
    public static void main(String[] args) {
        CSphere obj = new CSphere();
        obj.setLocation(3, 4, 5);
        obj.setRadius(1);
        System.out.printf("表面積 %f", obj.surfaceArea());
        System.out.printf("體積 %f", obj.volume());
    }
}
