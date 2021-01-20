package Day12_Math_Random;

import java.util.Scanner;

public class soru {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("sayi gir= ");
        int sayi=sc.nextInt();


        int text =(sayi> 50) ? 1 : 0;

        System.out.println(text);

    }
}
