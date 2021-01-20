package Day14_DoWhile_LOOPS;

import java.util.Scanner;

public class javaLoop6 {
    public static void main(String[] args) {


        // girilen bir sayıya kadar olan sayılardan tek olanlarını ekrana yazdurınız

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = sc.nextInt();


        while ( sayi > 0 ) {
            if (sayi % 2 == 1) System.out.println(sayi);

            sayi--;


        }

    }
}
