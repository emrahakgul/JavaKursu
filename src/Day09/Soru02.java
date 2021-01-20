package Day09;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {

        // 2- Girilen bir string içinde bir kelime arayınız, büyük harf veya küçük harf de olsa aranan kelimede bulsun...

        System.out.print("Herhangi birşey yaz: ");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();

        System.out.print("Ne aramak istiyorsunuz?");
        Scanner sc2=new Scanner(System.in);
        String text2=sc2.nextLine();

        System.out.println("\"" +text2+ "\""+" sözcüğü "+"\"" +text+ "\""+" cümlesinin içinde var mı? : "
                + text.toLowerCase().contains(text2.toLowerCase()));




    }
}
