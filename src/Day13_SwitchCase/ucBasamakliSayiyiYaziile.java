package Day13_SwitchCase;

import java.util.Scanner;

public class ucBasamakliSayiyiYaziile {

// girilen 3 basamaklı bir sayıyı yazı ile yazdır
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("üç basamaklı bir sayı giriniz: ");
        int sayi=sc.nextInt();

        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=sayi/100;

        switch (yuzler) {
            case 0: System.out.print("");break;
            case 1: System.out.print("Yüz");break;
            case 2: System.out.print("İkiyüz");break;
            case 3: System.out.print("Üçyüz");break;
            case 4: System.out.print("Dörtyüz");break;
            case 5: System.out.print("Beşyüz");break;
            case 6: System.out.print("Altıyüz");break;
            case 7: System.out.print("Yediyüz");break;
            case 8: System.out.print("Sekizyüz");break;
            case 9: System.out.print("Dokuzyüz");break;
        }

        switch (onlar) {
            case 0: System.out.print("");break;
            case 1: System.out.print(" on");break;
            case 2: System.out.print(" yirmi");break;
            case 3: System.out.print(" otuz");break;
            case 4: System.out.print(" kırk");break;
            case 5: System.out.print(" elli");break;
            case 6: System.out.print(" altmış");break;
            case 7: System.out.print(" yetmiş");break;
            case 8: System.out.print(" seksen");break;
            case 9: System.out.print(" doksan");break;
        }

        switch (birler) {

            case 0: System.out.print(" ");break;
            case 1: System.out.print(" bir");break;
            case 2: System.out.print(" iki");break;
            case 3: System.out.print(" üç");break;
            case 4: System.out.print(" dört");break;
            case 5: System.out.print(" beş");break;
            case 6: System.out.print(" altı");break;
            case 7: System.out.print(" yedi");break;
            case 8: System.out.print(" sekiz");break;
            case 9: System.out.print(" dokuz");break;
        }


    }

}
