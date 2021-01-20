package Mentoring.Haziran.ArrayMethods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_Soru1 {
    public static void main(String[] args) {
/*

todo Soru 1

 int array oluşturun.
 Sistem size "Kaç elemanlı bir Array oluşturmak istiyorsunuz ? (!!Tek sayı olmalı !! :  )  " şeklinde bir soru sorsun.

 Array'in kaç elemandan oluşacagına kullanıcı karar versin. (3,5,7)

 ve bu elemanları kullanıcıdan alın. (Scanner)     (1. sayıyı giriniz  ... .... )

 Array'in içindeki elemanları küçükten büyüğe sıralayın .(method kullanın)

  ve            'ortadaki'              elemanı bulması için bir program yazın. (Her ihtimali düşünmeniz gerekiyor. sadece 3 elemanlı bir array için değil, 33 elemanlı bir array için de çalışmalı).

  örn:  5 elemanlı bir array

 [ 3,2,6,12,1}
 ortanca sayı = 6

 */
        Scanner sc=new Scanner(System.in);
        System.out.print("Kaç elemanlı bir Array oluşturmak istiyorsunuz ? (Tek sayı olmalı): ");
        int[] sayiadet=new int[sc.nextInt()];

        for (int i=0; i<sayiadet.length; i++){
            sayiadet[i]=sc.nextInt();
        }
        int ortanca=(sayiadet.length-1)/2;
        Arrays.sort(sayiadet);
        System.out.println("Girilen sayılar: " + Arrays.toString(sayiadet));

        System.out.println("Ortadaki sayı: " +ortanca);



    }
}
