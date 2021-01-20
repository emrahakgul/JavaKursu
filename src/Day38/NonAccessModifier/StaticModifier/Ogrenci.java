package Day38.NonAccessModifier.StaticModifier;
//TODO oğrenci ve öğrenciler classındaki yorumlar
// okulad kısmı static yapıldıktan sonra konuldu.
public class Ogrenci {

    String ad;
    String soyad;
    static String okulad="Yıldırım";

    public Ogrenci(String ad, String soyad)//, String okulAd)
    {
        this.ad=ad;
        this.soyad=soyad;
       // this.okulad=okulAd;
    }
    void print()
    {
        System.out.println("Ogrenci:  " + ad+" "+soyad+"\n"+okulad+" Lisesi");
    }
}
