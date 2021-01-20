package Day07;

public class ilkkarakteribuyuk {
    public static void main(String[] args) {

        String name  = "merhaba DÜnya";
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase(); //.en sondaki tolowercase silersek geriye kalanı normaldeki gibi yazar.
        System.out.println(name);
    }
}
