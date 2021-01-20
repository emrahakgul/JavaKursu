package Day14_DoWhile_LOOPS;

import java.util.Scanner;

public class doWhile8 {
    public static void main(String[] args) {

        //Kullanııdan 0 girilene kadar sayı isteyiniz
        //bu soruyu önce while sonra do while
 //  önce while ile
      /*  Scanner sc=new Scanner(System.in);
        /*System.out.print("Bir sayı giriniz: ");
        int sayi=sc.nextInt();

        while (sayi!=0){
            System.out.print("Bir sayı giriniz: ");
            sayi=sc.nextInt();

    }*/
        // şimdi dowhile ile
        Scanner sc=new Scanner(System.in);
        int sayi;

        do {
            System.out.print("Sayı giriniz: ");
            sayi=sc.nextInt();
        }while (sayi !=0);



    }
}
