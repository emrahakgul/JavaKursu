package Mentoring.Haziran;

import javax.swing.*;
import java.util.Scanner;

public class Menupro {

    public static void main(String[] args) {
 /*
        Büfeden sipariş vereceksiniz.
        Double cuzdanim  oluşturun ve içerisinde 20 euro para olsun.
        Ve double toplamTutar oluşturun, her işlem sonrası artsın. (her siparişten sonra belirtilen fiyatı toplamtutara ekleyin!!

        ilk olarak konsolda;
        1.Hamburger : 3 Euro
        2.CheeseBurger: 4 Euro
        3.Döner : 2.5 Euro

        yazsın.   Kullanıcı int değeri girerek seçeneklerden birini seçsin.

                todo Eğer 1'i seçerse,
          (toplamTutara hamburgerin fiyatını eklemeyi unutmayın!!)
        Sistem bize "Ekstra Köfte İster misiniz ? (+1 Euro fark ile) :   (büyük küçük harf duyarlı olmaması için method kullanın)

        evet derse "2. köfte ekleniyor" mesajı gelsin.Altında da "Çift köfteli hamburgeriniz hazır !" yazsın.

        Hayır derse "Hamburgeriniz hazırdır !" yazsın.

        todo Eğer 2 yi seçerse,

         Sistem bize "Ekstra peynir ister misiniz? (+ 0,50 cent fark ile)  sorusunu sorsun.

         Evet derse, "2. peynir ekleniyor" mesajı, ve altına da "Çift peynirli Cheeseburgeriniz hazır! yazsın.

         Hayır derse, " ekstra peynirsiniz CheeseBurgeriniz hazır !"    yazsın.
          todo Eğer 3 'ü seçerse,

        Ekstra Sos ister misiniz ? (Barbekü sos ve Acı sos) :     sorusunu sorsun.
        evet


        Eğer Barbekü sos seçilirse "Barbekü soslu döneriniz hazır ! ",
        Eğer Acı sos seçilirse "Acı soslu döneriniz hazır !

        hayır derse,
     Döneriniz sossuz hazırlanıyor..


todo    İçecek ister misiniz ? (Mevcut içeceğimiz: Coca Cola = 1,5 Euro)

Eğer evet derse, "Normal ya da Zero ?  (normal veya zero olarak cevaplayınız ): "  sorusunu sorsun.

 Eğer normal derse, Coca Cola hazırlanıyor..
 Eğer  zero derse, Coca Cola Zero hazırlanıyor.


 Bu aşamaya kadar hep harcalamalar yaptık.
 Her harcama yaptıgımızda double toplamTutar'a bunu eklememiz gerekiyor.

 Önce cüzdanımı görmek istiyorum. (cüzdanım = 100 euro)
 Toplam tutarı yazdırın.. (45 euro )
 double paraUstu oluşturun ve paraüstünü yazdırın. (para üstü = 55 euro)



 -TODO İPUCU -  Dummy kod eklemeniz gereken yerleri tespit edin ve boş Line ekleyin. (String bosLine = sc.nextLine();)

                 */
        Scanner sc = new Scanner(System.in);
        double cüzdan = 20d;
        double total = 0;

        System.out.println("----Hangi menüyü istersiniz?----" + "\n" + "1.Hamburger : 3 Euro" + "\n" + "2.CheeseBurger: 4 Euro" + "\n" + "3.Döner : 2.5 Euro");
        int siparis = sc.nextInt();





                if (siparis==1)
            {  Scanner sc2 = new Scanner(System.in);
                System.out.println("Ekstra Köfte İster misiniz ?(+1 Euro fark ile) ");
                String yesno = sc2.nextLine();

                if (yesno.equalsIgnoreCase("evet")) {
                    total = 4;
                    System.out.println("2. köfte ekleniyor" + "\n" + "Çift köfteli hamburgeriniz hazır ! ");

                } else if (yesno.equalsIgnoreCase("hayır"))
                    total = 3;
                System.out.println("Hamburgeriniz hazırdır !");

            }
            else if (siparis==2)

            {  Scanner sc7=new Scanner(System.in);
                System.out.println("Ekstra peynir ister misiniz? (+ 0,50 cent fark ile ");
                String yesno1 = sc7.nextLine();

                if (yesno1.equalsIgnoreCase("evet")) {
                    total = total+0.5;
                    System.out.println("2. peynir ekleniyor" + "\n" + "Çift peynirli Cheeseburgeriniz hazır! ");


                } else if (yesno1.equalsIgnoreCase("hayır"))

                System.out.println("ekstra peynirsiniz CheeseBurgeriniz hazır !");

            }
           else if (siparis==3){
               Scanner sc6=new Scanner(System.in);
               System.out.println("Ekstra Sos ister misiniz ? (Barbekü sos ve Acı sos) ");
                String yesno3 = sc6.nextLine();

                if (yesno3.equalsIgnoreCase("evet")) {
                    System.out.println("Barbekü sos mu Acı sos mu :");
                    String sos = sc6.nextLine();
                    if (sos.equalsIgnoreCase("barbekü")) {

                        System.out.println("Barbekü soslu döneriniz hazır !");

                    } else if (sos.equalsIgnoreCase("acı"))
                        System.out.println("Acı soslu döneriniz hazır !");



                } else if (yesno3.equalsIgnoreCase("hayır"))

                System.out.println("Döneriniz sossuz hazırlanıyor..");

            }


            Scanner sc5=new Scanner(System.in);
            System.out.println("İçecek ister misiniz ? (Mevcut içeceğimiz: Coca Cola = 1,5 Euro) ");

            String yesno4 = sc5.nextLine();

            if (yesno4.equalsIgnoreCase("evet")) {
                System.out.println("Normal ya da Zero ?(normal veya zero olarak cevaplayınız ):");
                String icecek = sc5.nextLine();
                if (icecek.equalsIgnoreCase("normal")) {
                    total =total+1.5;
                    System.out.println("Coca Cola hazırlanıyor..");
                    System.out.println("Toplam tutar: " + total + " Euro");
                } else if (icecek.equalsIgnoreCase("zero"))
                    System.out.println("Coca Cola Zero hazırlanıyor. !");
                total =total+1.5;
                System.out.println("Toplam tutar: " + total + " Euro");

                System.out.println("Param: " + cüzdan + " Euro");
                double paraüstü = cüzdan - total;
                System.out.println("Paraüstünüz " + paraüstü + "Euro");

            } else if (yesno4.equalsIgnoreCase("hayır")) {


                System.out.println("Toplam tutar: " + total);
                System.out.println("Param: " + cüzdan + " Euro");

                double paraüstü = cüzdan - total;
                System.out.println("Paraüstünüz " + paraüstü + "Euro");

            }

        }
    }
