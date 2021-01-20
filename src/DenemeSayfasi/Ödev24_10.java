package DenemeSayfasi;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1- Girilen bir stringi int e çeviren bir program yazınız.
Girişler scannerla nextLine ile alınacak
Çevirme işlemini bir metod ile yapınız ve oluşabilecek hataları bir metod içinde kontrol ediniz.
 */
public class Ödev24_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Bir sayi gir: ");
        String strsayi=sc.nextLine();

     deneme(strsayi);
    }
    public static String deneme(String str)
    {

        for (int i = 1; i <2; i++) {
            try {
                int sayi=Integer.parseInt(str);
                System.out.println("Girdiğiniz sayının int Hali = " + sayi);
                break;
            }
            catch (NumberFormatException hata) {
                System.out.print("hata oldu : ");
                System.out.println("Lütfen sayıyı rakamlarla yaz");
                System.out.println(hata.getMessage());
                System.out.println(hata.fillInStackTrace());

            }

            finally {
                System.out.println("---------------");
            }
        }


        return str;
    }
}
