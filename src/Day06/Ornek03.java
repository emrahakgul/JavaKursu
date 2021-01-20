package Day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ornek03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
     //Konsoldan 2 sayı girip toplamı isteyiniz...
        System.out.print("Bir sayı gir: ");
        int a=sc.nextInt();
        System.out.print("Bir sayı daha gir: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Girilen sayıların toplamı: " + c);
        // System.out.println("Toplam:" + a + b ) ;   Burada sayıları yanyana yazar..toplamaz
        // System.out.println( "Toplam :" + (a+b)); Böyle de olur ama toplanacak sayılar parantez içinde olması gerek...
    }
}
