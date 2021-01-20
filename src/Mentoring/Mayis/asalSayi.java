package Mentoring.Mayis;

import java.util.Scanner;

public class asalSayi {

    public static void main(String[] args) {

        // asal sayı mı değil mi? (Prime number)
        // girdiğimiz sayıya kadar olanları yazdır

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int number=sc.nextInt();
        int counter=2;
        boolean isPrime=true;

        while (counter<number) {
            if (number%counter==0){
                isPrime=false;
                break;
            }
            counter++;  // bu sorudaki mantık girilen sayını asal olup olmadığını 2 ve counter ++ ile girilen sayıya kadar tek tek deneyip bulacak.. kalan sıfır sa....
                        // 9 girildi counter 2 olduğu için 2 den bölümü 0 değil...sonra 3 deneyecek kalan sıfır olduğu için direk asal değil....msla 11 için
               // sayaç 11 e kadar deneyecek kalan 0 mı değil mi diye....
            }
if (isPrime==true) {
    System.out.println("Asal");
}
else {
    System.out.println("Asal değil");
}

        }




    }


