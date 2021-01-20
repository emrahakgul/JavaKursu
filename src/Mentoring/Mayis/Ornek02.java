package Mentoring.Mayis;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Rakamla bir sayı gir: ");
        int sayi =sc.nextInt();
        sc.nextLine();
        System.out.print("String bir sayı daha gir: ");
        String Ssayi=sc.nextLine();

        //Stringi int e fönüştürmemiz lazım
        int sayi3 =Integer.parseInt(Ssayi);


        System.out.println("Toplam: " + (sayi+sayi3));


    }
}
