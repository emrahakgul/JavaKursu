package Day10_ComparisionOperators;

import java.util.Scanner;

public class JavaIf7 {
    public static void main(String[] args) {
        // girilen sayının onlar basamağı tek mi çift mi
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı  giriniz: ");
        int sayi=sc.nextInt();

        int sayi2=(sayi%100)/10; //  int onlar = (sayi/10) % 10 ; // onlar bamağını veriyor
        int sayi3=sayi2%2;

        if (sayi3 ==1)
            System.out.println("Onlar basamağı tek");


        if (sayi3==0)
            System.out.println("Onlar basamağı çift");



    }
}
