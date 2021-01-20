package Day12_Math_Random;

import java.util.Scanner;

public class Soru2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("birinci sayı: ");
        int a=sc.nextInt();
        System.out.print("ikinci sayı: ");
        int b=sc.nextInt();
        System.out.print("üçüncü sayı: ");
        int c=sc.nextInt();



        System.out.println("üç sayıdan  büyük olan= " + Math.max(Math.max(a,b),c));
    }
}


