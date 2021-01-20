package Day10_ComparisionOperators;

import java.util.Scanner;

public class JavaIf2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Sayı  giriniz: ");
        int sayi=sc.nextInt();

        if (sayi > 0) {
            System.out.println("Girilen sayı Pozitif");

        }
        if (sayi < 0) {
            System.out.println("Girilen sayı negatif");
        }
         if (sayi == 0) {
                System.out.println("Girilen sayı 0'eşit");


        }
    }
}
