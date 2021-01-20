package Day06;

import java.util.Scanner;

public class Ornek05 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Kaç bilet istiyorsunuz?");
        int bilet=sc.nextInt();

        System.out.print("Sigorta istiyor musunuz?");
       boolean sigorta=sc.nextBoolean();

        if (sigorta = true) {
            System.out.println(bilet +" Bilet ve " + "Sigorta istiyorsunuz.");
        } else if (sigorta == false) {
            System.out.println(bilet +"B ilet ve " + "Sigorta istemiyorsunuz.");
        }
        sc.close();




    }
}
