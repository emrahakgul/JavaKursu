package Day34.Task;
// Üniversitede Öğrencilere Ders kaydı programı yapılmak isteniyor.
// Önce ders tanımlamaları yapılacak, sonra her öğrenci için alabileceği ders saatini geçmeyecek şekilde, dersler
// öğrencilere eklenecek.
// 1- Adım : Yeni ders oluşturmak için Lesson adında bir sınıf tanımlayınız : fields: name, hour
// 2- Adım : Ders oluşturma metodunu yazınız. createLesson
// 3- Adım : 3 adet ders tanımlayınız.
//    mat101 6 saat,  fiz101 4 saat, java101 6 saat
// 4- Adım : Student isminde yeni bir class tanılayınız:
//           fields : name, maxAlabilecegiDersSaatMiktari
// 5- Adım : Öğrenci oluşturmayı bir metod ile yazınız.createStudent
// 6- Adım  : 2 adet öğrenci oluşturunuz:
//            Adı: Mehmet, maxAlabilecegiDersSaatMiktari=20 olsun
//            Adı: Ayşe, maxAlabilecegiDersSaatMiktari=12
// 7- Adım :  Öğrenciye ders Eklemek için bir dersListesi tutacak bir
//            field ekleyiniz: studentLessons adında
// 8- Adım :  Öğrenciye ders ekleyen LessonAdd isimli bir metod yazınız;
//  fakat ders eklenirken toplam ders saat miktarı öğrencinin alabileceği saat
//  miktarını aşmasın, aşarsa uyarı versin.
// yani öğrencinin alabileceği max saat miktarına baksın, geçmeyecekse eklesin.
//9- Adım  : Her öğreninin aldığı dersleri yazan bir metod yazınız.ve
//           dersleri yazdırınız. printLesson

public class UniDersKaydi {
    public static void main(String[] args) {



Lesson java101=Lesson.dersOlusturma("Java",6);
Lesson fizik101=Lesson.dersOlusturma("Fizik",4);
Lesson mat101=Lesson.dersOlusturma("Matematik",6);


Student ogr1=Student.OgrOlusturma("Mehmet",20);
Student ogr2=Student.OgrOlusturma("Ayşe",12);

ogr1.LessonAdd(fizik101);
ogr1.LessonAdd(mat101);
ogr1.LessonAdd(java101);

        ogr2.LessonAdd(fizik101);
        ogr2.LessonAdd(mat101);
        ogr2.LessonAdd(java101);

        ogr1.derslerigöster();
        ogr2.derslerigöster();


    }


}
