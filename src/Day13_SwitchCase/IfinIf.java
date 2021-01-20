package Day13_SwitchCase;

import java.util.Scanner;

public class IfinIf {

    // Bu konu nested olarak geçer

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı gir: ");
        int sayi=sc.nextInt();

        if (sayi<100){
            System.out.println("Sayı 100 den küçük");
        if (sayi<50) {
            System.out.println("Sayı 100 den küçük");
            if (sayi < 25) {
                System.out.println("Sayı 25 den küçük");
            }
        }
        }
    }

}
