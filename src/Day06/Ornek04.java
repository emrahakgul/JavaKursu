package Day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ornek04 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Ülkenizi giriniz:");
        String ülke =sc.nextLine();
        System.out.print("Boyunuzu giriniz:");
        double boy =sc.nextDouble();

        System.out.print("Kilonuzu giriniz:");
        double kilo =sc.nextDouble();

        System.out.println("Ülkeniz: " + ülke +"\n"+ "Boyunuz: " + boy +"\n"+ "Kilonuz: " + kilo);




    }
}
