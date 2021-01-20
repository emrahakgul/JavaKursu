package Day11_IF_Else_Logic;

import java.util.Scanner;

public class ifElse1 {

    public static void main(String[] args) {

//Öğrenicini girilen  notuna göre  50 den büyük ise geçtiniz küçük ise kaldınız diye yazdırıız...

        Scanner sc=new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        int ogrNot =sc.nextInt();

        if (ogrNot>=50) {
            System.out.println("Geçtiniz...");
            System.out.println("Tebrikler");
        }
        if (ogrNot<50) {
            System.out.println("Kaldınız...");
            System.out.println("Tekrar deneyiniz  ");
        }
        if (ogrNot>=50)
        System.out.println("Geçtiniz");
        else
            System.out.println("Kaldınız");

    }
}
