package Day13_SwitchCase;

import java.util.Scanner;

public class SwitchSoru {
    public static void main(String[] args) {
// verilen sayının 10larbasamağındaki sayıyı yazı ile yazdır....
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı gir:  ");
        int sayi = sc.nextInt();

        int onlar = (sayi / 10) % 10;
        switch (onlar) {
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println(" üç");break;
            case 4: System.out.println("dört"); break;
            case 5: System.out.println("beş"); break;
            case 6: System.out.println("altı"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz");  break;
            case 9: System.out.println("dokuz");  break;
        }
    }
}
