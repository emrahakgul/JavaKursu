package Day08;

public class StringReplace {
    public static void main(String[] args) {
        //Bu komut verilen karakterleri  verilen diğer değerle değiştirir...

        String text="Merhaba Dünya";
        System.out.println("a >e: " + text.replace('a','e')); // tek karakter için tek tırnak
        System.out.println("ba>be: "+ text.replace("ba","be")); // birden fazla karakter için çift tırnak
        System.out.println("Dünya>Java: " + text.replace("Dünya","Java"));


    }

}
