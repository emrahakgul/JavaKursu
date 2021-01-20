package Day10_ComparisionOperators;

import java.util.Scanner;

public class JavaIf4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Sayı  giriniz: ");
        int sayi1=sc.nextInt();

        System.out.print("Başka Bir Sayı  giriniz: ");
        int sayi2=sc.nextInt();

        if (sayi1>sayi2)
            System.out.println("İlk sayı daha büyük");

        if (sayi1<sayi2)
            System.out.println("ikinci sayı daha büyük");

        if (sayi1==sayi2)
            System.out.println("iki sayı eşit");

    }
}
