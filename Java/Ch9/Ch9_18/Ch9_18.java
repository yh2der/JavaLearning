class NameCard {
    private String name;   
    private String address;
    private Phone data;    

    class Phone {
        String tel;
        String mobile;

        void setPhone(String te, String mob) {
            tel = te;
            mobile = mob;
        }
    }

    NameCard(String na, String ad) {
        name = na;
        address = ad;
        data = new Phone();
    }

    void setPhone(String tel, String mobile) {
        data.setPhone(tel, mobile);
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Tel: " + data.tel);
        System.out.println("Mobile: " + data.mobile);
    }
}
public class Ch9_18 {
    public static void main(String[] args) {
        NameCard tom = new NameCard("Tom","123 City");
        tom.setPhone("345-7612","0971-666000");
        tom.show();
    }
}