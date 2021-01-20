package Day11_IF_Else_Logic;

import java.util.Scanner;

public class IfelseLogic7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Kaç saat park edeceksiniz: ");
        int saat=sc.nextInt();


        if (saat  <= 2)
            System.out.println("Öde 5 tl ");
        else if ( saat <= 5)
            System.out.println("Öde 10 tl ");
        else
            System.out.println("Öde 15 tl ");

    }
}
