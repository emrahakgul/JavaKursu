package Day11_IF_Else_Logic;

import java.util.Scanner;

public class Ifelselogic6 {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner sc=new Scanner(System.in);
        System.out.print("Parola gir: ");
        String parola =sc.nextLine();
        // bir if te birden falza sout varsa süslü parantez kullan

        if (parola.length()>=8 && parola.length()<=12 && !parola.contains("pass")  )
            System.out.println("Parolanız uygundur");

            else System.out.println("Parola kurallara uygun değildir");

    }
}
