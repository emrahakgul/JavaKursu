package Mentoring.Temmuz.JavaOOP.OOPTask;
/*
    konu ve ogrenci/ogretmen siniflarini da cagiracak sekilde instance variable lar olusturunuz.
    ogrencinin olusturdugu raporu verecek bir toString methodu olusturunuz.
    soyle gozukmeli:

    Dersin konusu: Java
    Isim: Hasan
    Yas: 26
    Bolum: Bilgisayar
    Not ortalamasi: 67

    Ogretmenin adi: Ali
    Mezun oldugu bolumu: Isletme
    Ogretmenin kalitesi: Olaganustu kaliteli bir ogretmen

     */
public class Sinif {

    String konu;
    Ogrenci ogrenci;
    Ogretmen ogretmen;

    public String toString()
    {
        return "Dersin konusu: "+ konu +" \n Öğrenci ismi: "+ogrenci.isim + "\n Bölümü: " +ogrenci.bölüm+"\n Yaşı: " +ogrenci.yas+"\n İlk Sınavı: " +ogrenci.sinav1+
                "\n İkinci Sınavı: " +ogrenci.sinav2+"\n Üçüncü Sınavı: " +ogrenci.sinav3+"\n Ortalaması: " +ogrenci.notortalamasi()+
                "\n\n Öğretmenin ismi: " +ogretmen.isim+"\n Bölümü: " +ogretmen.bolüm+"\n Deneyim : " +ogretmen.deneyim+"\n Kalite: " +ogretmen.ogretmenimNasil();


     }
}
