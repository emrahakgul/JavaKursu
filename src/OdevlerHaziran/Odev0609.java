package OdevlerHaziran;

import java.util.Scanner;

public class Odev0609 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("x koordinatını giriniz: ");
        int x=sc.nextInt();
        System.out.print("y koordinatını giriniz: ");
        int y=sc.nextInt();

        if (x>=-1 && x<=8 && y>1 && y<4)
            System.out.println( "Nokta dikdörtgenin İçinde");
        else if (x>=-2 || x<=8 && y>=1 || y<=4)
            System.out.println( "Nokta dikdörtgenin Kenarları Üstünde");
        else
            System.out.println("Nokta dikdörtgenin Dışında");

    }
}
