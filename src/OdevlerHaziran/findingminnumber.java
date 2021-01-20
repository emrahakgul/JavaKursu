package OdevlerHaziran;

import java.util.Scanner;

public class findingminnumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int i1 = scan.nextInt();
        System.out.print("TekrarBir sayı gir: ");
        int i2 = scan.nextInt();
        System.out.print("Son bir sayı gir: ");
        int i3 = scan.nextInt();

        if ((i1 <= i2) && (i1 <= i3))
            System.out.println("En küçük sayı: " + i1);
        else if ((i2 <= i1) && (i2 <=i3))
            System.out.println("En küçük sayı: " +i2);
        else
            System.out.println("En küçük sayı: " +i3);
    }
}
