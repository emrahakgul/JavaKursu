package Day14_DoWhile_LOOPS;

import java.util.Scanner;

public class JavaLoop7 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı iste sonra bunların en büyüğünü bul....
        Scanner sc=new Scanner(System.in);
        int maks=0;
        int sayac=0;
        while (sayac<5){
            System.out.print("Bir sayı: ");
            int sayi=sc.nextInt();
            if (sayi>maks){maks=sayi;}
            sayac++;
        }
        System.out.println("maks = " + maks);


    }
}


