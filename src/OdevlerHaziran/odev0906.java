package OdevlerHaziran;

import java.util.Scanner;

public class odev0906 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("x koordinatını giriniz: ");
        int x=sc.nextInt();
        System.out.print("y koordinatını giriniz: ");
        int y=sc.nextInt();

        if (x>0 && y>0)                   // x artı y artı
            System.out.println( "A bölgesinde");
        else if (x<0 && y>=0)               //x eksi y artı
            System.out.println("B bölgesinde");
        else if (x<0 && y<0)                //x eksi y eksi
            System.out.println("C bölgesinde");
        else if (x>=0 && y<0)                 //x artı y eksi
            System.out.println("B bölgesinde");
        else System.out.println("Orjin" );
    }
}
