package Day06;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        String ad;
        System.out.print("Adınız ne?");
        ad=sc.nextLine();

        String soyad;
        System.out.print("Soyadınız ne?");
        soyad=sc.nextLine();

        System.out.println("Adınız: " + ad);
        System.out.println("Soyadınız: " + soyad);

    }
}
