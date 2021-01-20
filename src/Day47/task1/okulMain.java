package Day47.task1;
//  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
//  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
//  3- Bütün fieldlar için encapsulation uygulayınız.
//  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
//     ArrayList cinsinden Öğrencileri olsun.
//  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
//  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
//     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
//     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
// Bu soruya ek :  kullanıcı yaş yerine harf veya kelime girerse bu
// hatayı da kontorl ettirerek yeniden öğrenci isteyiniz.

import java.util.ArrayList;
import java.util.Scanner;


public class okulMain {
    public static void main(String[] args) {

        Okul okul1=new Okul("Kabataş Lisesi", 3);
        ArrayList<Ogrenci> okulunOgrenciler = okul1.getOgrencilistesi();
        // burada okul1 oluşturulurken oluşan ArrayList get metodu ile alındı.

        int ogrenciSayisi=1;
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        do{
            System.out.print(ogrenciSayisi +".Öğrencinin Adı=");
            String ogrAd=oku.nextLine();

            System.out.print(ogrenciSayisi +".Öğrencinin Soyadı=");
            String ogrSoyad=oku.nextLine();

            System.out.print(ogrenciSayisi +".Öğrencinin Yaşı=");
            int yas=okuInt.nextInt();

            try {
                Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, yas);
                //okul1.getOgrenciler().add(ogr);
                okulunOgrenciler.add(ogr); // alınan ArrayListe ogrenci eklendi
                ogrenciSayisi++;
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
                System.out.println("Yeni Öğrenci giriniz");
            }

        }while (ogrenciSayisi <= okul1.getMaxOgrenci());

        for(Ogrenci ogr: okul1.getOgrencilistesi())
        {
            System.out.println("ogr = " + ogr);
        }
    }
}
