package Mentoring.Haziran;

import java.util.Scanner;

public class mentorswitchbankamatik {
    public static void main(String[] args) {

         /*                      todo   Basit ATM projesi
        int bakiye belirleyin ve bakiyemizde başlangıçta 1000 tl olsun.
       todo ipucu : ->  para çekme ve yatırma işlemleri için de bir int create edin. Her işlemde arrtırın veya azaltın. (int islem)
        Sistem bize ilk olarak seçenekleri sunmalı. Örn:
        1.Bakiye görüntüle
        2.Para yatırma
        3.Para çekme
        4.Sistemden çıkış
       Switch - Case kullanarak  4 seçenekten birini seçtirin.
       1. Bakiye görüntüle derse, sistem toplam bakiyeyi yazdırsın.
       2.Para yatırma derse, "ne kadar yatırmak istiyorsunuz?" sorusu gelsin. Bir değer girilsin ve yeni  bakiye yazdırılsın.
       3.Para çekme derse, " ne kadar para çekmek istiyorsunuz?" sorusu geldin. Bir değer girilsin ve yeni bakiye yazdırılsın.
       4.Sistemden çıkış dediğinde " Sistemden çıkılıyor.." mesajını versin.
       5.Yanlış tuşlama yapıldığında "Geçersiz işlem" mesajını versin.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Hangi işlemi yapmak istiyorsunuz?");
        System.out.println("1.Bakiye görüntüle");
        System.out.println("2.Para yatırma");
        System.out.println("3.Para çekme");
        System.out.println("4.Sistemden çıkış");

        int islem = sc.nextInt();
        int bakiye=1000;

        switch (islem) {
            case 1:
                System.out.println("Hesabınızda " + bakiye + "lira var.");
                break;
            case 2:
                System.out.println("Ne kadar para yatıracaksın");
                int miktar = sc.nextInt();
                bakiye += miktar;
                System.out.println("Yeni bakiye " + bakiye + " Tl");
                break;
            case 3:
                System.out.println("Ne kadar para yatıracaksın");
                miktar = sc.nextInt();
                bakiye -= miktar;
                System.out.println("Hesabınızda" + bakiye + " tl kaldı");
            case 4:
                System.out.println("Sistemden çıkılıyor");
                break;
            default:
                System.out.println("Yanlış tuşlama");


        }
    }
}
