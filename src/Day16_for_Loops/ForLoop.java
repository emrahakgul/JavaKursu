package Day16_for_Loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int sayi=sc.nextInt();
            int toplam=0;
        for (int i=1; i<sayi; i++ ) {

            toplam+=i;
        }
        System.out.println(sayi +" e kadar olan rakalmların toplamı " +  toplam);

        }
    }

