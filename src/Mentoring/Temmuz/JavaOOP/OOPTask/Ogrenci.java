package Mentoring.Temmuz.JavaOOP.OOPTask;

    //isim, bolum, yas, birinciSinav, ikinciSinav ve ucuncuSinav instance variable
    // (degiskenlerini) iceren bir Ogrenci class i olusturunuz
    //ogrencinin not ortalamasini hesaplayacak bir method olusturunuz.

public class Ogrenci {

    String isim;
    String bölüm;
    int yas;;
    int sinav1;
    int  sinav2;
    int sinav3;

    int notortalamasi()
    {
        return (sinav1+sinav2+sinav3)/3;
    }
}
