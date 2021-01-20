package Day08;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {

        System.out.print("Adınızı ve soyadınızı giriniz: ");
        Scanner sc2 =new Scanner(System.in);
        String adsoyad=sc2.nextLine();

        int bosluknerde=adsoyad.indexOf(" ");

        String ad1=adsoyad.substring(0,bosluknerde);
        //String soyad1=adsoyad.substring(bosluknerde,adsoyad.length()); // bu da olabilir...
        String soyad1=adsoyad.substring(bosluknerde+1);
        System.out.println("Adınız:"+ad1);
        System.out.println("Soyadınız:"+soyad1);

    }




}
