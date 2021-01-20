package DenemeSayfasi;

import java.util.Date;
import java.util.Scanner;

public class Deneme1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        /*String a ="10 Ocak 1990";

        System.out.println("Doğum günüm " + a); */

        String a ="Kinshasa";
        String b="10 sene önce";
        String c="yaşıyordum";
        System.out.println(b + a + "da" + c );

        System.out.print("En çok hangi meyveyi seviyorsun?");
        String meyve =sc.nextLine();

        System.out.print("En sevdiğim meyve:" + meyve);



    }
}
