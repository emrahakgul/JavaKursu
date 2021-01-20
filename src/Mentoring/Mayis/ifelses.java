package Mentoring.Mayis;

import java.util.Scanner;

public class ifelses {
    public static void main(String[] args) {

        /* Sistem size            "Bir String giriniz."   cümlesini versin.
        hepsi if in içinde olacak !
                Eğer Stringde    a karakteri varsa,   a karakterinden sonraki kısım ile
                yeni bir string kaydedilsin ve tüm harfleri büyük olsun. (a karakteri dahil)
        Daha sonra     ilk stringi yazdırınız, altına da a karakterinden sonraki kısma sahip olan Stringi yazdırınız


        Eğer a karakteri yoksa "Girdiğiniz Stringde a karakteri yoktur..     mesajını versin.

        örn:    String giriniz:
        If else çok kolay gibi

        Yeni String= AY GİBİ
        Eski String = çok kolay gibi

 */
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir String giriniz. ");
        String str=sc.nextLine();

    if (str.contains("a")){
        String yeni =str.substring(str.indexOf("a")).toUpperCase();
        System.out.println("Yeni String: " + yeni);
        System.out.println("Eski String: " + str);

    }else
        System.out.println( "Girdiğiniz Strind'de a karakterğ yok");

    }
}

