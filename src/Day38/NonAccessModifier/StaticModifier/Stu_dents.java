package Day38.NonAccessModifier.StaticModifier;

public class Stu_dents {
    public static void main(String[] args) {
      Stu_dent ogr1=new Stu_dent("Emrah","Akgül");
      Stu_dent ogr2=new Stu_dent("Ömer","Ender");
      Stu_dent ogr3=new Stu_dent("Yeliz","Akg");
      //...
        // ...
        // ...
        //...
        Stu_dent ogrenci= new Stu_dent("Mehmet","Güler");
        Stu_dent ogrenci2= new Stu_dent("Esra","Gül");

        System.out.println("Öğrenci Sayısı: "+ Stu_dent.ogrencisayisi);

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);
        System.out.println("ogrenci = " + ogrenci);
        System.out.println("ogrenci2 = " + ogrenci2);

        // Static anahtar ının 3 adet kullanım amacı var.
// 1- Metoda ve fileda direk class üzerinden ulaşım.
// 2- Tekrarlanan ifadeler için hafızayı iyi kullanma
// 3- Oluşturulan nesneler için sayaç görevi için de kullanılır.
    }
}
