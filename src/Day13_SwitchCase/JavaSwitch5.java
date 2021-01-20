package Day13_SwitchCase;

import java.util.Scanner;

public class JavaSwitch5 {

    public static void main(String[] args) {
// 3 basamaklı bir sayı nın onlar basamağını nasıl buluruz
        // önce 10a bölerim 17 çıkar ben 7 ye ulaşmak istiyorum...bunun için modül on alsan 7 kalır ....
        //sonucu da yazı ile yazdırmak istiyorum...
        Scanner sc=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı gir: ");
        int sayi=sc.nextInt();
        int onlarbasamagi=(sayi/10)%10;
        onlarbasamagi= Math.abs(onlarbasamagi);

        switch (onlarbasamagi)
        {
            case 0:System.out.println("Sıfır");break;
            case 1:System.out.println("Bir");break;
            case 2:System.out.println("iki");break;
            case 3:System.out.println("Üç");break;
            case 4:System.out.println("Dört");break;
            case 5:System.out.println("Beş");break;
            case 6:System.out.println("Altı");break;
            case 7:System.out.println("Yedi");break;
            case 8:System.out.println("Sekiz");break;
            case 9:System.out.println("Dokuz");break;
        }
    }
}
