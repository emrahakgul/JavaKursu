package Day10_ComparisionOperators;

import java.util.Scanner;

public class JavaIf3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Sayı  giriniz: ");
        int sayi=sc.nextInt();

        if (sayi % 2==1)
            System.out.println("Girilen sayı tek");


        if (sayi % 2==0)
            System.out.println("Girilen sayı çift");

    }
    }

