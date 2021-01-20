package Day11_IF_Else_Logic;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi giriniz=");
        int num = sc.nextInt();

        if (num>0)
            System.out.println("pozitif");
        else
        if (num<0)
        System.out.println("negatif");
        else
        System.out.println("sifir");




    }
}
