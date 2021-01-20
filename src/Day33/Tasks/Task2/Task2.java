package Day33.Tasks.Task2;

import java.util.ArrayList;


// Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
// 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-3 arasında değer alıyor)
// 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
// tutacak bir liste
// 3- 3 adet ders oluşturunuz.
// 4  1.öğrenci oluştur. max credit 10 olsun
// 5 Bu öğrencinin ders listesine acılmış olan derleri ekle fakat maxcredit aşılmaması gerek.. şarsa geçildi diye uyarı versin
//6 Aşağıdaki ders oluşturma kısmı için ilgili sınıfta lessonCreate adında bir metod oluştrurunuz..
// 7Öğrenciye ders ekleme bölümü ile ilgili sınıfta bir metod yazınız...
public class Task2 {
    public static void main(String[] args) {

/*School okul=new School();
okul.Ad="sdsd";
okul.Adres="dsad";
Student.SchoolInfo=okul;
 */

        Lessons mat101=new Lessons();
        mat101.name="Matematik";
        mat101.credit=3;

        Lessons Turkce101=new Lessons();
        Turkce101.name="Türkçe";
        Turkce101.credit=6;

        Lessons fizik101=new Lessons();
        fizik101.name="Fizik";
        fizik101.credit=4;


        Student ogrenci1=new Student();
        ogrenci1.name="Haci";
        ogrenci1.maxcredit=10;

     //burdaki işlemi  farklı bir metodla yapacağız oyuzden yoruma aldık...
       // ogrenci1.dersListesi.add(mat101);
       // ogrenci1.dersListesi.add(Turkce101);
       // ogrenci1.dersListesi.add(fizik101);


        ogrenci1.dersListesi=new ArrayList<>();

// öğrencini toplam kredisini check edeceğiz...
// Eklenecek ders ile öğrencinin o ana karadrki kredisi toplamı öğrencinin alabicelği krediyi aşmıyorsa  dersi ekle

        if (ogrenci1.totalCredit()+mat101.credit<=ogrenci1.maxcredit)
        {
         ogrenci1.dersListesi.add(mat101);
            System.out.println("Matematik dersi eklendi");
        }
        else {
            System.out.println(" Krediniz dolu...Ders eklenemiyor");
        }

        if (ogrenci1.totalCredit()+ Turkce101.credit<=ogrenci1.maxcredit)
        {
            ogrenci1.dersListesi.add(Turkce101);
            System.out.println("Türkçe dersi eklendi");
        }
        else {
            System.out.println(" Krediniz dolu...Ders eklenemiyor");
        }

        if (ogrenci1.totalCredit()+ fizik101.credit<=ogrenci1.maxcredit)
        {
            ogrenci1.dersListesi.add(fizik101);
            System.out.println("Fizik dersi eklendi");
        }
        else {
            System.out.println(" Krediniz dolu...Ders eklenemiyor");
        }






    }
}
