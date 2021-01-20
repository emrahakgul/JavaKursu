package Day44;


// kullanıcıdan hava sıcaklığını isteyiniz.
// ayrı bir metodda bunun kontrolünü yaparak hava
// sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz
// mainden çağırarak hatayı kontrol ediniz.


import java.io.IOException;
import java.util.Scanner;

public class _08_CheckedThrowException {
    // Eğer bir metod içerisinde Checked Throw var ise, metoda adına hata işareti
    // eklenmeden derlenmesine izin verilmez.Hata çizgisini üzerine gelindiğinde Add ...
    // a tıklandığınd aototmatik ekleyecektir.Bu şekidle bu metodu çağıran yerlerin try catch e
    // alınması garantiye alınmış olur.
    public static void Sicaklikkontrol(int sicaklik) throws IOException
    {


           if (sicaklik<10)
           {
               throw new IOException("Hava gerçekten soğuk dışarı çıkma");
           }
        System.out.println("Dışarda basket oynayabilirsin");
    }


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("Hava kaç derece?");
        int derece=sc.nextInt();

        try { Sicaklikkontrol(derece);

        }catch (Exception ex)
        {
            System.out.println("ex = " + ex);
        }

    }
}
