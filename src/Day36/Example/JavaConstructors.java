package Day36.Example;

import Day36.Example.Student;

public class JavaConstructors {
    public static void main(String[] args) {

        //1 yol
    /*    Student student1=new Student();
      student1.id=3598655;
      student1.name="Emrah";
      student1.surname="Ak";
      student1.classroom=1;   */


      //2 yol metod ile
      //  Student ogrenci2=Student.createStudent(15465,3,"ali","akg");


       // 3. ve esas yöntem: nesne oluşturmak ve değerleri atamak için
        Student ogrenci3=new Student(34654,"ender","akgül",5);
        System.out.println("Ogrenci3:"+ "\n" + "ismi: " + ogrenci3.name+ "\n"
                +"soyismi: "+ ogrenci3.surname+ "\n"
                +"id: "+ogrenci3.id+ "\n"+"sınıfı " +ogrenci3.classroom);

        Student ogrenci4=new Student(4,"hakan","ahmet");
        Student ogrenci5=new Student(4,"hakan");
        Student ogrenci6=new Student(4);
        Student ogrenci7=new Student();
        ogrenci7.id=7;
        ogrenci7.name="Veli";
        ogrenci7.surname="Kara";
        ogrenci7.classroom=7;



    }
}
