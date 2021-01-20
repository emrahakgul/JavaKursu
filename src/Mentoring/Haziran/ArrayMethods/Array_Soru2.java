package Mentoring.Haziran.ArrayMethods;

import java.util.Arrays;

public class Array_Soru2 {
    public static void main(String[] args) {
 /*
İnt array oluşturunuz ve eleman sayısı 5 olsun.
Elemanlar random atansın. (10 a kadar - 10 dahil)

Array'i yazdırınız.     array = [......]

Daha sonra Array'daki maximum değeri bulunuz ve yazdırınız.

ÖRN:
array[2,5,3,6,3]

maximum değer =67
 */
        int [] dizi = new int[5];

        for (int i=0 ; i<dizi.length; i++){

            dizi[i] = (int) (Math.random() * 10 + 1);

        }

        for (int i =0; i< dizi.length; i++){
            System.out.println("dizi[" + i + "] = " + dizi[i]);

        }
        Arrays.sort(dizi);
        System.out.println("Dizinin Sıralanmış hali: " + Arrays.toString(dizi));
        System.out.println("Dizideki en büyük değer: " + dizi[dizi.length-1]); // Burada sıralamada en byük en sonda olduğu için son sayısı yazdırmış.


    }
}
