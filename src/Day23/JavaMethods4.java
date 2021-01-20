package Day23;

public class JavaMethods4 {
    public static void main(String[] args) {
        //Burada return komutu yok o yuzden method void ile oluyor......

        ortalamaBulYaz("Ali", 60,10,5,95,10,60);
        ortalamaBulYaz("Mehmet", 60,70,46,60);
        ortalamaBulYaz("Ömer", 80,100,100);
        ortalamaBulYaz("Osman", 10,8,95,00,60);
    }

    public static void ortalamaBulYaz(String isim, int...notlar)
    {
    double toplam=0;
    for (int not:notlar)
    {
        toplam+=not;

    }
        System.out.println("Öğrenci ismi : " + isim + " Ortalaması : " +toplam/notlar.length);
    }
}

