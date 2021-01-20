package Day11_IF_Else_Logic;

import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("sayı gir: ");
        int sayi =sc.nextInt();

        int sayı2=sayi%2;


        if (sayi==0)
            System.out.println(" Sayı çift");
        else
            System.out.println(" Sayı tek");
    }
}
