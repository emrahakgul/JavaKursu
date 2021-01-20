package Day38.NonAccessModifier.StaticModifier;
//TODO oğrenci ve öğrenciler classındaki yorumlar
// okulad kısmı static yapıldıktan sonra konuldu.
public class Ogrenciler {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Ali","Yılmaz"); //"Yıldırım");
        Ogrenci ogr2=new Ogrenci("Ayşe","Demir") ;//"Yıldırım");
      //  ...
    //...
        //...
        Ogrenci ogr500=new Ogrenci("Mehmet","ÖzDemir");//"Yıldırım");
    //500 tane öğrenci oluşturuldu..

        //Burada 500 öğrencicinin okulu aynı sondaki String okulad gereksiz yer
        // kaplamasın diye onu Static yapacağız


        ogr1.print();
        ogr2.print();
        ogr500.print();

        //1- Kural static field a sadece class dan erişilir
        //2- Kural diğer field lara sadece new ile oluşturulmuş nesnelerden
        //   ulaşılır.
        //3- Ancak oluşturulmuş bir nesnenin metodlarında
        //   static değişkene ulaşılabilir.



    }
}
