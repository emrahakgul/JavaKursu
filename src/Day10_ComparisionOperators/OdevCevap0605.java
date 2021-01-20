package Day10_ComparisionOperators;

import java.util.Scanner;

public class OdevCevap0605 {
    public static void main(String[] args) {


        System.out.println("=============================CEVAP 1============================");
        // 1-Girilen bir sayının birler basamağını ekrana yazdır....

        System.out.print("Bir sayı giriniz: ");
        Scanner sc=new Scanner(System.in);
        int sayi1=sc.nextInt();


        System.out.println("Girilen sayının birler basamağı : "+ sayi1%10);


        System.out.println("=============================CEVAP 2============================");
                 //2.girilen bir sayının onlar basamağını yazdır
        System.out.println("Girilen sayının birler basamağı : "+(sayi1%100-sayi1%10)/10);

        System.out.println("=============================CEVAP 3============================");
                 // 3. girilen bir sayının yüzler basamağını yazdır
        System.out.println("Girilen sayının yüzler basamağı = " + (sayi1 % 1000 ) / 100);
        System.out.println("=============================CEVAP 4============================");
            // 4. girilen 3 basamaklı bir sayının basamakları toplamını yazdır...
        //                    435= 4+3+5 olacak şekilde
        System.out.print("3 basamaklı bir sayı girin: ");
        Scanner sc3=new Scanner(System.in);
        int sayi3 =sc3.nextInt();
        int yuzler,onlar,birler;

        yuzler = sayi3/100;
        sayi3 = sayi3%100;
        onlar =sayi3/10;
        birler  = sayi3 %10;

        System.out.println("Bu sayının Basamakları Toplamı = "+(yuzler+onlar+birler));



        System.out.println("=============================CEVAP 5============================");
        //5. girilen 3 basamaklı bir sayının basamaklarına göre tersini bşr sayı olarak yazdır örnek 435  534

        System.out.println("Bu sayının tersten yazılışı = "+(birler)+(onlar)+(yuzler));

        System.out.println("=============================CEVAP 6============================");

        int gg=(2020*365)+(2020/4); // her yıl çeyrek gün artıyor bunu bulmak için de 2020 yi 4 bölüyoruz...
        // bir yıl 365 gün 6 saat... 2020 yıl kaç gün...
        System.out.println("2020 yılına kadar geçen gün sayısı: " +gg);




    }
}
