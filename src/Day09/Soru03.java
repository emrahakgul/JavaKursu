package Day09;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {

        //3-Girilen bir stringdeki bütün boşluk karakterlerini _ ile değiştiriniz.

        System.out.print("Herhangi birşey yaz: ");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();

        System.out.println("Normal hali:                           " +  text);
        System.out.println("Boşlukların '-' ile değiştrlmiş hali = " + text.replaceAll("[ ]","_"));

    }
}
