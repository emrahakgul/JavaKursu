package Day31.tasks.task1;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        /*
        // create class student with fields:
        // string name, int not
        // Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir ArrayList e ekleyin.
        // Daha öğrenci bilgilerin yazdıran bir metod yazarak , Arraylist teki öğrenci bilgilerini döngü yazdırınız.
        // Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.
         */

        Students ogrenci1=new Students();
        ogrenci1.name=" Emrah";
        ogrenci1.not=95;

        Students ogrenci2=new Students();
        ogrenci2.name="Ömer";
        ogrenci2.not=98;

        Students ogrenci3=new Students();
        ogrenci3.name="Ender";
        ogrenci3.not=99;

        ArrayList<Students> ogrenciler = new ArrayList<>();
        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);
        ogrenciler.add(ogrenci3);

        //metod ile yazdıralım
        BilgileriYazdir(ogrenciler);

        //Ortalamalar
      OrtalamaBul(ogrenciler);
    }


    public static void BilgileriYazdir(ArrayList<Students>ogrenciler){
        for (Students ogr: ogrenciler){
            System.out.println("ogr name = " + ogr.name+" Notu: "+ ogr.not);
        }

    }

    public static double OrtalamaBul(ArrayList<Students> ogrenciler)
    {
        double ort=0;
        double toplam=0;
        for(Students ogr: ogrenciler)
        {
            toplam += ogr.not;
        }

        ort=toplam / ogrenciler.size();

        return ort;
    }
}

class Students{

    String name;
    int not;
}