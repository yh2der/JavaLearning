public class Ch4_16 {
    public static void main(String[] args) {
        int change = (50-23);
        int ten = change/10;
        change %= 10;
        int five = change/5;
        change %= 5;
        System.out.println(ten + "個十元 " + five + "個五元 " + change + "個1元");
    }
}
