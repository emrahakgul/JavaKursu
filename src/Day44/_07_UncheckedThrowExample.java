package Day44;

import java.util.Scanner;

public class _07_UncheckedThrowExample {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz=");
        String username=oku.nextLine();

        // throw ile kendimiz hata oluşturuyoruz.
        // böylece kritelerimize girmeyenler için de
        // catch bloğunua düşürerek, paratik kullaanım sağlıyoruz.

        try {
            if (username.length() < 6)
                throw new Exception("6 karakterden az olamaz");

            if (username.length() > 10)
                throw new Exception("10 karakterden fazla olamaz");
        }
        catch(Exception ex)
        {
            System.out.println("ex = " + ex);
        }
    }
}
