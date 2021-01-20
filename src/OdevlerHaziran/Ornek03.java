package OdevlerHaziran;

import java.util.Scanner;

public class Ornek03 {
    public static void main(String[] args) {
        System.out.println("\"-------ÖDEV-----\"");
        //TODO 3 isimlik bir ismi kısaca yazdırın z.m.d

        System.out.println("\"-------Cevap 1-----\"");
        System.out.print("Adınızı ve soyadınızı giriniz: ");
        Scanner sc =new Scanner(System.in);
        String ad=sc.nextLine();

        char ilkharf=ad.charAt(0);
        int bosluk =ad.indexOf(" ");
        int sonbosluk=ad.lastIndexOf(" ");
        char adikiharf =ad.charAt(bosluk+1);
        char soyadilkharf =ad.charAt(sonbosluk+1);

        System.out.println(ilkharf +"."+adikiharf+"."+soyadilkharf);

        //TODO // 2 kelimelik bir isimde ad ve soyadı ayırın
        System.out.println("\"-------Cevap 2-----\"");

        System.out.print("Adınızı ve soyadınızı giriniz: ");
        Scanner sc2 =new Scanner(System.in);
        String adsoyad=sc2.nextLine();

        int bosluknerde=adsoyad.indexOf(" ");

        String ad1=adsoyad.substring(0,bosluknerde);
        String soyad1=adsoyad.substring(bosluknerde,adsoyad.length());
        System.out.println("Adınız: " + ad1);
        System.out.println("Soyadınız: " + soyad1);


        //TODO 3 kelimelik bir isimde ad ikinci ad ve soyad olarak ayırınız
        // (Şöyle Ahmet Emin Yılmaz şeklinde girilen bir tam isimdeki bütün kelimeleri ayırınız)

        System.out.println("\"-------Cevap 3-----\"");

        System.out.print("Adınızı ve soyadınızı giriniz: ");
        Scanner sc3 =new Scanner(System.in);
        String adsoyad2=sc3.nextLine();

        int bosluknerde1=adsoyad2.indexOf(" ");
        int digerbosluk=adsoyad2.lastIndexOf(" ");


        String kelime1=adsoyad2.substring(0,bosluknerde1);
        String kelime2=adsoyad2.substring(bosluknerde1,digerbosluk);
        String kelime3=adsoyad2.substring(digerbosluk,adsoyad2.length());
        System.out.println("1. Kelime :" +kelime1);
        System.out.println("2. Kelime :" +kelime2);
        System.out.println("3. Kelime :" +kelime3);


        //TODO bir stringin boş olup olmadığını kontrol ediniz


        System.out.println("\"-------Cevap 4-----\"");

        String str1="Bugün Hava Bulutlu";
        System.out.println("SAtırda boşluk varmı? :" + str1.isEmpty());

    }
}
