package PROJE3_Day25;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*Soru 1:
        CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
        büyük harfe çevirip geri döndüren metodun yazınız.  Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel */
public class Soru_1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle=sc.nextLine();

            CamelCase(cumle.trim().replaceAll("[ ]+ ", " "));
    }
    public static void CamelCase(String kelime)
    {
        String[] yeti=kelime.split(" ");
       for (int i=0; i<yeti.length; i++) {
           String newyeti=yeti[i].concat(" ");
           System.out.print(newyeti.substring(0,1).toUpperCase()+newyeti.substring(1,newyeti.length()).toLowerCase());
       }
    }
}
