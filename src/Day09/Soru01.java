package Day09;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

                //TODO ÖDEV Çözümleri
       /*   1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin hepsini küçük ve daha sonra büyük hallerini yazdırınız. */
        System.out.print("3 kelime giriniz: ");
        Scanner sc=new Scanner(System.in);
        String ad=sc.nextLine();

        int bosluk =ad.indexOf(" ");
        int bosluk2 =ad.lastIndexOf(" ");

        String basharfbuyuk = ad.toUpperCase().charAt(0)+ad.substring(1,ad.indexOf(" ")).toLowerCase()+
                    " "+ad.toUpperCase().charAt(bosluk+1)+(ad.substring(bosluk+2,ad.lastIndexOf(" "))).toLowerCase()+
                " "+ad.toUpperCase().charAt(bosluk2+1)+ad.substring(bosluk2+2,ad.length()).toLowerCase();

        String basharfkucuk = ad.toLowerCase().charAt(0)+ad.substring(1,ad.indexOf(" ")).toLowerCase()
                +" "+ad.toLowerCase().charAt(bosluk+1)+ad.substring(bosluk+2,ad.lastIndexOf(" ")).toLowerCase()
                +" "+ad.toLowerCase().charAt(bosluk2+1)+ad.substring(bosluk2+2,ad.length()).toLowerCase();

                System.out.println("Normal hali:                         " + ad );
                System.out.println("Baş Harfler büyük gerisi küçük:      " + basharfbuyuk);
                System.out.println("Baş Harfler küçük kalanlar da küçük: " + basharfkucuk);











    }
}
