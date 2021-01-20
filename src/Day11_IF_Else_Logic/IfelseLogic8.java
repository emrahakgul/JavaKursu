package Day11_IF_Else_Logic;

import java.util.Scanner;

public class IfelseLogic8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print(" 1. sayıyı giriniz: ");
        int sayi1=sc.nextInt();
        System.out.print(" 2. sayıyı giriniz: ");
        int sayi2=sc.nextInt();

        Scanner sc2=new Scanner(System.in);
        System.out.print("Hangi işlem:  ");
        String islem=sc2.nextLine();


        if (islem.equalsIgnoreCase("T"))
            System.out.println(sayi1+sayi2);
        else if (islem.equalsIgnoreCase("Ç"))
            System.out.println(sayi1-sayi2);
        else if (islem.equalsIgnoreCase("P"))
            System.out.println(sayi1*sayi2);
        else if (islem.equalsIgnoreCase("B"))
            System.out.println(sayi1/sayi2);



    }
}

