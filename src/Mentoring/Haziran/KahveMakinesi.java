package Mentoring.Haziran;

import java.util.Scanner;

public class KahveMakinesi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----Hangi kahveyi istersiniz?----" + "\n" + "1.Türk kahvesi" + "\n" + "2.Filtre Kahve" + "\n" + "3.Espresso" + "\n");
        String hangiKahve = sc.nextLine();

        if (hangiKahve.equalsIgnoreCase("türk kahvesi")) {
            System.out.println("Türk kahvesi Hazırlanıyor");
        }
        else if (hangiKahve.equalsIgnoreCase("filtre kahve")) {
            System.out.println("Filtre kahve Hazırlanıyor");

        }
        else if (hangiKahve.equalsIgnoreCase("espresso")) {
            System.out.println("Espresso Hazırlanıyor");
        }
        else
            System.out.println("Hatalı tuşlama yaptınız. Lütfen tekrar giriş yapınız.");




        System.out.println("Süt eklenmesini ister misiniz ? (Evet ya da Hayır olarak cevaplayınız.)");
        String sut = sc.nextLine();

        if (sut.equalsIgnoreCase("evet")) {
            System.out.println("Süt Ekleniyor...");
        }
        else if (sut.equalsIgnoreCase("hayır")) {
            System.out.println("Süt eklenmiyor.");
        }
        else
            System.out.println("Hatalı giriş yaptınız...Lütfen Evet ya da Hayır şeklinde cevap veriniz. ");



        System.out.println("Şeker eklenmesini ister misiniz ? (Evet ya da Hayır olarak cevaplayınız.)");
            String seker = sc.nextLine();

            if (seker.equalsIgnoreCase("evet")) {
                System.out.println("Kaç şeker eklensin?");
                Scanner oku=new Scanner(System.in);
                int kacseker = oku.nextInt();
                System.out.println(kacseker + " Şeker ekleniyor");
            }

            else if (seker.equalsIgnoreCase("hayır")) {
                System.out.println("Şeker eklenmiyor.");
            }
            else System.out.println("Hata Lütfen tekrar deneyiniz...");



            System.out.println("Kahve hangi boyutta olsun? (Büyük boy - Orta boy - Küçük boy)");
            String boy = sc.nextLine();

            if (boy.equalsIgnoreCase("Büyük boy")) {
                System.out.println("Kahveniz büyük boy hazırlanıyor...");
            }
            else if (boy.equalsIgnoreCase("orta boy")) {
                System.out.println("Kahveniz orta boy hazırlanıyor...");

            } else if (boy.equalsIgnoreCase("küçük boy")) {
                System.out.println("Kahveniz küçük boy hazırlanıyor...");
            }
            else
                System.out.println("Hata!  Lütfen sadece Büyük boy - Orta boy - Küçük boy şeklinde giriş yapınız..");
            

            System.out.println(hangiKahve + " " + boy + " hazırdır. Afiyet olsun.");


        }
    }



