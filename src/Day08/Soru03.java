package Day08;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {

        System.out.print("Adınızı ve soyadınızı giriniz: ");
        Scanner sc3 =new Scanner(System.in);
        String adsoyad2=sc3.nextLine();

        int bosluknerde1=adsoyad2.indexOf(" ");
        int digerbosluk=adsoyad2.lastIndexOf(" ");


        String kelime1=adsoyad2.substring(0,bosluknerde1);
        String kelime2=adsoyad2.substring(bosluknerde1+1,digerbosluk); // +1 demek bir karakter sonrasından başla demek
        String kelime3=adsoyad2.substring(digerbosluk+1); //burdaki +1ler boşlukları yazdırmasın diye koyduk....
        System.out.println("1. Kelime:"+kelime1);
        System.out.println("2. Kelime:"+kelime2);
        System.out.println("3. Kelime:"+kelime3);
    }
}
