package Day06;

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {

        int sayi=0; // bunu tanımladığımız gibi aşağıda tanımlıyoruz...
        Scanner gir =new Scanner(System.in); //Klavyeden veri girişi yapılacak...

        System.out.print("Bir sayı giriniz: ");
        sayi=gir.nextInt();
        System.out.println("Girilen Sayı= "+ sayi);




    }
}
