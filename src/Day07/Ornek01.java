package Day07;

import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız kelimenin son harfini bulunuz....


        System.out.print("Bir kelime giriniz: ");
        Scanner sc =new Scanner(System.in);
        String kelime =sc.nextLine();
           // uzunluk adedi verir.. son index i ise bize lenght-1 verecektir.

        int hrfuzunluk =kelime.length();
        char sonharf = kelime.charAt(hrfuzunluk-1);
        System.out.println("Son harf = " +sonharf);
        //ya da
        System.out.println("Son harf: " + kelime.charAt(kelime.length()-1));



    }
}
