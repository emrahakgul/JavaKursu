package Day07;

public class StringIndexOf {
    public static void main(String[] args) {

        //Verilen karakterlerin

        String text ="Good";

        System.out.println("G harfinin indexi: " + text.indexOf("G")); // indexler 0 dan başlar.
        System.out.println("d harfinin indexi: "  + text.indexOf("d"));
        System.out.println("H harfinin indexi: " + text.indexOf("H")); // sonuç bullunamadı yani -1 çıkar...
        System.out.println("od nin indexi: "+ text.indexOf("od")); // ilk harfin başladığı  yeri verir

        int index=text.indexOf("o");

        System.out.println("index:" + index); // birden fazla varsa ilkini gösterri
    }
}
