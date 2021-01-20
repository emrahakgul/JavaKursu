package Day34.Task;

import java.util.ArrayList;

public class Student {
    String name;
    int Maxhours;
    ArrayList<Lesson> StudentLessons = new ArrayList<>();


    public static Student OgrOlusturma(String isim, int Maxsaat) {
        Student newogr = new Student();
        newogr.name = isim;
        newogr.Maxhours = Maxsaat;

        return newogr;
    }


    public void LessonAdd(Lesson ders)
    {
        int toplamkredi = 0;
        for (Lesson aldigiders: StudentLessons)
        {
            toplamkredi+=aldigiders.hour;
        }
        if (toplamkredi+ders.hour<Maxhours)
        {
            StudentLessons.add(ders);
            System.out.println(name +" için " +ders.name +  " dersi eklendi");
        }
        else {
            System.out.println(" Krediniz dolu...Ders eklenemiyor");
        }
    }

    public void derslerigöster()
    {
        System.out.println(name + " adlı öğrencinin aldığı dersler: " + "Toplam kredisi: "+ Maxhours  );
for (Lesson dersler: StudentLessons)
{
    System.out.println(dersler.name +" "+ dersler.hour+ " saat");

}
    }
}