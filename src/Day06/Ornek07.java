package Day06;

import java.util.Scanner;

public class Ornek07 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
         //Kyullanıcıdan username String password int ve gizli soruyu cümle olarak al ve yazdır
        // komuttaki nextLine ve sadece next farkı next in sadece kelime diğerinin ise satırı.

        System.out.print("Username: ");
        String usr =sc.nextLine();

        System.out.print("Password: ");
        int pass =sc.nextInt();

        sc.nextLine(); // satırı geçmemesi için ekledim
        System.out.print("Gizli soru: ");
        String gzl =sc.nextLine();

        System.out.println("Username: " + usr + "\n"+ "Password: " + pass + "\n"+ "Gizli soru: "  + gzl) ;

    }
}
