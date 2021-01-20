package Day12_Math_Random;

import java.util.Scanner;

public class MathclassMethods {

    public static void main(String[] args) {
// Kullanıcıdan alt ve üst değeri  tek bir satırda arasında boşluk olarak (önce min bir boşluk
        // sonra max değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max ı   5 75

        Scanner sc = new Scanner(System.in);
        System.out.print("min max degerini yan yana bir boşlukla giriniz =");
        String min_max = sc.nextLine();

        int boslukIndex=min_max.indexOf(" ");
        int min = Integer.parseInt( min_max.substring(0, boslukIndex) );
        int max = Integer.parseInt( min_max.substring(boslukIndex+1) );

        int randomNumberInRange = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNumberInRange = " + randomNumberInRange);

    }
}
