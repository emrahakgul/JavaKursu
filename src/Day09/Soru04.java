package Day09;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {

        //4- Kullanıcdan alacağını şifreniz sizin sabit belirlediğiniz şifre ile aynı olup olmadığını ,
        //   büyük küçük harf ayırımı olmadan kontrol ederek sonucu yazdırınız

        System.out.print("Şifre giriniz: ");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();

        String sfrem="0Ab54";

        System.out.println("Girilen şifre Doğru mu:" + text.equalsIgnoreCase(sfrem));

    }
}
