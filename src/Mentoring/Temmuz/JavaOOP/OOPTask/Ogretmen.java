package Mentoring.Temmuz.JavaOOP.OOPTask;
//isim, bolum ve deneyim instance variable (degiskenlerini) iceren bir Ogretmen class i olusturunuz.
//ogretmenimNasil adli bir method icinde deneyim yilina gore ogretmenin kalitesini olcun.
public class Ogretmen {
    String isim;
    String bolüm;
    int deneyim;


    String ogretmenimNasil()
    {
        if (deneyim>0&&deneyim<=2) {
            System.out.println("tecrübesiz");
        }
        else if (deneyim>2 && deneyim<=5)
        {
            System.out.println(" orta tecrübe");
        }
        else
        {
            System.out.println(" Tecrübeli");
        }
        return "";
    }

}


