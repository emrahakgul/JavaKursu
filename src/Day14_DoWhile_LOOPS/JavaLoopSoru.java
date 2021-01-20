package Day14_DoWhile_LOOPS;

import java.util.Scanner;

public class JavaLoopSoru {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı iste en büyüğünü bul
        Scanner sc=new Scanner(System.in);

            //herzamanki  gibi bir scanner sout yapıp bunları içine alıp  bir sayaç beraberinde döngü yapabiliriz..
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü buluarak yazdırınız.
                int enb = 0;
                int sayac=1;
                while(sayac <= 5) {
                    System.out.print(sayac+".Sayı giriniz= ");
                    int sayi = sc.nextInt();

//            if (sayi > enb)
//                enb = sayi;

                    enb = Math.max(enb, sayi);
                    sayac++;
                }

                System.out.println("enb = " + enb);
            }

    }

