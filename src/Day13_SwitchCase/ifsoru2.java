package Day13_SwitchCase;

import java.util.Scanner;

public class ifsoru2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("a gir:  ");
        int a=sc.nextInt();
        System.out.print("b gir:  ");
        int b=sc.nextInt();
        System.out.print("c gir:  ");
        int c=sc.nextInt();
        int delta=(b*b)-4*a*c;
        if (delta  >0) {
            System.out.println("1. kök " + ((-b + Math.sqrt(delta)) / 2));
            System.out.println("2. kök " + ((-b - Math.sqrt(delta)) / 2));
        }
        else if ( delta == 0)
            System.out.println("1kök var: "+(-b)/(2*a));

        else if (delta < 0)                        // ya da else den sounra direk sout
            System.out.println("kök yok ");


        /*
        public static void main(String[] args) {
        // katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
        // ax^2 + bx + c;

        // Çözüm adımları
        // kullanıcıdan a,b,c yi okutun.
        // Delta = b*b - 4*a*c
        // Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2*a)  , x2= (-b - kök(d)) / (2*a)
        // Delta = 0 => 1 tane kök vardır x = -b/2a
        // Delta < 0 ise kök yoktur

        Scanner oku = new Scanner(System.in);
        System.out.print("a =");
        int a= oku.nextInt();
        System.out.print("b =");
        int b= oku.nextInt();
        System.out.print("c =");
        int c= oku.nextInt();

        int d = b*b - 4*a*c;

        if (d > 0) {
            System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2*a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2*a)));
        }
        else
            if (d == 0){
                System.out.println("x = " + (-b/2*a) );
            }
            else
                System.out.println("kök yoktur");
         */


    }
}
