package Day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ornek06 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Cadde: " );
        String cadde=sc.nextLine();

        System.out.print("Sokak: " );
        String sokak=sc.nextLine();

        System.out.print("Posta Kodu: " );
        int pk=sc.nextInt();

        sc.nextLine(); // Bunu string den sonra int yazıp daha sonra tekrar string yazınca konsolda atlamaması için ekliyoruz.

        System.out.print("ülke: " );
        String ulke=sc.nextLine();

        System.out.println("Cadde: " + cadde +"\n "+"Sokak: " + sokak+ "\n "+"Posta kodu: " +  pk+ "\n " +"Ülke: " + ulke);

    }
}
