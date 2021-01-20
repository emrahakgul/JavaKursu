package Day07;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {
            // konsoldan verilen isim soy ismi(2kelimelik) arada nokta olacak şekilde baş harflarini yazdır.1 lkerede

        Scanner sc =new Scanner(System.in);
        System.out.print("isim ve soyisim gir:");
        String isim=sc.nextLine();

        char adilkharf =isim.charAt(0);
        int bosluk =isim.indexOf(" "); // bu indexin 1 fazlası herzmaan diğer kelimenin ilk harfidir.
        char soyadilkharf =isim.charAt(bosluk+1);


        System.out.println(adilkharf+"."+soyadilkharf); // E.Y çıkar

    }
}
