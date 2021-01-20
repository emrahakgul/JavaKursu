package PROJE3_Day25;

import java.util.Scanner;

 /* Soru 3:
       SubtractionSquare:
       getSumOfSquares adında bir sayı alan ve bu sayıya kadar olan sayıları
       toplayıp çıkan sonucun karesini döndüren bir metod yazınız.

       substSquare isminde 2 adet int parametre alan ve int sonuç döndüren bir metod daha yazınız.

               main den   substSquare   metoduna 2 tane sayı gönderiniz, bu metodun içinden de
       getSumOfSquares metodunu çağırarak gönderilen bu iki sayı için işlem sonuçlarını toplayarak
       main metodundan yazdırınız.

               Örnek:

       int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir
       int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir
       3025 + 225 = 3250
       return 3250 */
public class Soru_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();
       System.out.println("Bir sayı giriniz: ");
        int sayi2 = sc.nextInt();

        getSumOfSquares(sayi+sayi2);

    }



    public static void getSumOfSquares(int sayix) {

        int toplam = 0;
        int i;
        for (i = 0; i <= sayix; i++) {
            toplam += i;
        }
        int toplamkarex = toplam * toplam;

        int toplam2 = 0;
        int j;
        for (j = 0; j <= sayix; i++) {
            toplam += j;
        }
        int toplamkarez = toplam * toplam;

        System.out.println(toplamkarex + toplamkarez);


    }
}