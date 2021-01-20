package OdevlerMayis;

public class Odev0530DataTypes {

    public static void main(String[] args) {


        //TODO Ödevler

        // 1. En sevdiğiniz 3 meyveyi alt alta yazdırınız.
        System.out.println("----------Cevap 1----------");

        String EnSevdigimMeyve1 ="Elma";
        String EnSevdigimMeyve2 ="Kiraz";
        String EnSevdigimMeyve3 ="Karpuz";

        System.out.println("En Sevdigim Meyve1 = " + EnSevdigimMeyve1 +"\n" + "En Sevdigim Meyve2 = " + EnSevdigimMeyve2  +"\n" + "En Sevdigim Meyve3 = " + EnSevdigimMeyve3);

        System.out.println("----------Cevap 2----------");

        System.out.println("\"Elma\"");
        System.out.println("\"Kiraz\"");
        System.out.println("\"Karpuz\"");

        System.out.println("----------Cevap 3----------");

        String marka ="Samsung Galaxy Note 9";

        System.out.println(marka.toUpperCase());

        System.out.println("----------Cevap 4----------");
        String ad ="Emrah ";
        String soyad ="Akgül";
        int yas =30;
        String aa ="Benim adım ";
        String yy = " yaşındayım.";

        System.out.println(aa + ad + soyad + "'dür ve Ben " + yas + yy);



        System.out.println("----------Cevap 5----------");
        int a =25;
        int b =50;

        int toplam =a+b;
        System.out.println("25+50="+ toplam);

        System.out.println("----------Cevap 6----------");

        short s =15;
        short h =30;
        short stoplam = (short) (s+h);
        System.out.println("Toplam=" + stoplam);



        System.out.println("----------Cevap 7----------");

        double aylik =30.5;
        int aySayisi =9;

        double toplamfiyat =aylik*aySayisi;

        System.out.println("Toplam fiyat : " + toplamfiyat + " Euro");


        System.out.println("----------Cevap 8----------");

        int number1 =100;
        double number2=67.7;
        short number3=44;

        double toplam2 =number1+number2+number3;

        String toStr =Double.toString(toplam2);

        System.out.println("Double to Str = " + toStr);


        System.out.println("----------Cevap 9----------");

        int k =40;
        int l=k*2;
        int m=(k+l)-35;

        int sonuc =k+l+m;

        double ss =(double)sonuc;
        System.out.println("InttoDouble Sonuç:  " + ss);




    }
}
