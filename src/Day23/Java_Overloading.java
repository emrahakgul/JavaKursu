package Day23;

public class Java_Overloading {
    // Metodlarda overloading
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 6;
        int sayi3 = 78;

        // paramatere sayısından ve tipi farklı olduğu durumlarda aynı metod adı kullanılabilir
        int sonuc = toplam(sayi1, sayi2);
        int sonuc1 = toplam(sayi1, sayi2, sayi3);
        System.out.println(sonuc);
        System.out.println(sonuc1);

        double dSayi1 = 5.2;
        double dSayi2 = 6.4;

        double sonuc3 = toplam(dSayi1, dSayi2);

        System.out.println("sonuc3 = " + sonuc3);
        /***************************/
        // parametrelerin tip sırası farklı olduğunda da aynı isim kullanılabilir
        KullaniciBilgiYaz("Ahmet", 34);
        KullaniciBilgiYaz(34, "Ahmet");
    }

    public static void KullaniciBilgiYaz(int yas, String ad) {
        System.out.println(ad + " " + yas);
    }

    public static void KullaniciBilgiYaz(String ad, int yas) {
        System.out.println(ad + " " + yas);
    }


    public static double toplam(double a, double b) {
        return a + b;
    }

    public static int toplam(int a, int b) {
        return a + b;
    }

    public static int toplam(int a, int b, int c) {
        return a + b + c;
    }
}