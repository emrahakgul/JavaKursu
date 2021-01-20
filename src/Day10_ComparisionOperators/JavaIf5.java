package Day10_ComparisionOperators;

import java.util.Scanner;

public class JavaIf5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Sayı  giriniz: ");
        int sayi=sc.nextInt();

        int birler=sayi%10;

        if (birler ==0) System.out.println("Girilen sayının birler basamağı 0");
        if (birler ==1) System.out.println("Girilen sayının birler basamağı 1");
        if (birler ==2) System.out.println("Girilen sayının birler basamağı 2");
        if (birler ==3) System.out.println("Girilen sayının birler basamağı 3");
        if (birler ==4) System.out.println("Girilen sayının birler basamağı 4");
        if (birler ==5) System.out.println("Girilen sayının birler basamağı 5");
        if (birler ==6) System.out.println("Girilen sayının birler basamağı 6");
        if (birler ==7) System.out.println("Girilen sayının birler basamağı 7");
        if (birler ==8) System.out.println("Girilen sayının birler basamağı 8");
        if (birler ==9) System.out.println("Girilen sayının birler basamağı 9");


    }
}
