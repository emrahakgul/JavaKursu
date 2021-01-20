package Day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ornek0000 {
    public static void main(String[] args) {

        System.out.print("Banka hesabınız var mı?");
        Scanner sc = new Scanner(System.in);
        boolean hesap = sc.nextBoolean();
        if (hesap == true) {
            System.out.println("Banka hesabınız var.");
        } else if (hesap == false) {
            System.out.println("Banka hesabınız yok");
        }
        sc.close();









    }
}
