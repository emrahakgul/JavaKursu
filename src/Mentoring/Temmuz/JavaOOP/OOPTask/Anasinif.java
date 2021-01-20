package Mentoring.Temmuz.JavaOOP.OOPTask;

public class Anasinif {
    public static void main(String[] args) {


        Sinif sinif=new Sinif();
        sinif.konu="Java";

        sinif.ogrenci=new Ogrenci();


        sinif.ogrenci.isim="Hasan";
        sinif.ogrenci.bölüm="Bilgisayar";
        sinif.ogrenci.yas=20;
        sinif.ogrenci.sinav1=65;
        sinif.ogrenci.sinav3=40;
        sinif.ogrenci.sinav2=95;

        sinif.ogretmen=new Ogretmen();
        sinif.ogretmen.isim="Ali";
        sinif.ogretmen.bolüm="Matematik";
        sinif.ogretmen.deneyim=6;

        System.out.println(sinif);

    }
}
