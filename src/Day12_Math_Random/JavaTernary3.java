package Day12_Math_Random;

import java.util.Scanner;

public class JavaTernary3 {

    public static void main(String[] args) {
            //Kullanıcının gireceği sayı çift ise bir stringe çift atayınız
        // tek ise tek atayınız ekrana stringi yazdır

        Scanner sc=new Scanner(System.in);
        System.out.print("sayi = ");
        int sayi=sc.nextInt();

        String text="";
       /*  if (sayi % 2 ==0)
        text="çift";

        else text ="tek"; */

        //ternary şekli 3lü operatör şekli
        //şart kısmı
        text =(sayi % 2==0) ? "çift" : "tek";
       //          şart        doğru     yanlış   ":" else yekarşılk geliyor
        System.out.println(text);



    }
}
