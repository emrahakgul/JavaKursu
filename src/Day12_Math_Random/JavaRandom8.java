package Day12_Math_Random;

import java.util.Scanner;

public class JavaRandom8 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("3'a kadar Bir sayı gir: ");
        int sayi=sc.nextInt();


        int bulunan=(int)(Math.random()*sayi +1);
        if (bulunan==sayi)
            System.out.println("Tebrikler buldunuz");
        else System.out.println("Tekrar gir" );


        /*    // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int kacaKadarRandomSayi= oku.nextInt();

        int uretilenSayi = (int) (Math.random()*kacaKadarRandomSayi+1);

        System.out.print("Sayı tahmininiz = ");
        int tahmin = oku.nextInt();

        if (uretilenSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedinki bilemedinki");

        System.out.println("uretilenSayi = " + uretilenSayi); */
    }
}
