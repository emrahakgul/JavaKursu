package Day34.Example1;

import org.junit.Assert;
import org.junit.Test;

public class test1 {
// test dosyası oluşturma

    //aşağıya olduğu gibi metod yazıp başına test diyoruz sonra import ediyoruz....Burada Rectangle sınıfını test edeceğiz...

    @Test
    public void testGetArea()
    {// nesneyi oluştur, ve verileri hazırla
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length=5;
        dikdortgen.width=4;
// beklenen yani actual değeri al
        int sonuc=dikdortgen.getArea(); // 20 çıkması lazım
// Assert ile karşılaştır
        Assert.assertEquals("Testi geçti. ",20,sonuc);
    }


    @Test
    public void testGetArea2()
    {
        // nesneyi oluştur, ve verileri hazırla
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length =5;
        dikdortgen.width =4;

        // beklenen yani actual değeri al
        int sonuc = dikdortgen.getArea(); // actual değer yani o anda gelen değer

        // Assert ile karşılaştır
        Assert.assertEquals("Testi geçemedi. ",22, sonuc);
    }
}


