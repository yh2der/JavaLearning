class CData {
    private String name;	// 姓名
    private String email;	// 電子郵件信箱
    private int mm;    		// 生日的月
    private int dd; 		// 生日的日
    private int yy; 		// 生日的年
    //a
    void setName(String name) {
        this.name = name;
    }
    //b
    void setEmail(String email) {
        this.email = email;
    }
    //c
    void setBirthday(int m, int d, int y) {
        if (!checkDate(m, d, y)) {
            System.out.printf("日期格式設定錯誤");
        }
        else {
            this.mm = m;
            this.dd = d;
            this.yy = y;
        }
    }
    //d
    private boolean checkDate(int m, int d, int y) {
        if (y <= 1900 && y>= 2099) return false;
        if (m<=1 && m>=12) return false;
        else {
            if (m == 2) {
                if (d<=1 || d>=28)  return false;
            }
            else if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
                if (d<=1 || d>=30)  return false;
            }
            else {
                if (d<=1 || d>=30)  return false;
            }
        }
        return true;
    }
    //e
    void setAll(String name, String email, int m, int d, int y) {
        this.name = name;
        this.email = email;
        this.mm = m;
        this.dd = d;
        this.yy = y;
    }
    //f
    void showData() {
        System.out.printf("name %s\nEmail %s\n生日 %d/%d/%d", name, email, mm, dd, yy);
    }
}
public class Ch8_16 {
    public static void main(String[] args) {
        //h
        CData tom = new CData();
        tom.setName("Tom");
        tom.setEmail("abc@gmail.com");
        tom.setBirthday(6, 36, 2006);
        tom.showData();
        //i
        CData mary = new CData();
        mary.setAll("Mary", "123@gmail.com", 11, 15, 2000);
        mary.showData();
    }
}