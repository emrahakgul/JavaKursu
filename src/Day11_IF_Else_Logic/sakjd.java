package Day11_IF_Else_Logic;

import java.util.Scanner;

public class sakjd {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Vize sınav sonucunuzu giriniz :");
        double vize=sc.nextDouble();
        System.out.println("vize = " + vize);

        System.out.print( "Final sınav sonucunuzu giriniz :");
        double final1=sc.nextDouble();
        System.out.println("Final = " + final1);


        double ortalam1=(vize*0.4)+(final1*0.6);

//       System.out.println( "ortalamaniz :"+ortalam1);

        if( ortalam1>=90) {
            System.out.print("notunuz: " + "AA");

        } else if(ortalam1>=80){
            System.out.print("notunuz: " + "BA");
        } else if(ortalam1>=70){
            System.out.print("notunuz: " + "BB");
        }   else if(ortalam1>=70){
            System.out.print("notunuz: " + "CB");
        } else if(ortalam1>=60){
            System.out.print("notunuz: " + "CC");

        } else if(ortalam1>=50){
            System.out.print("notunuz: " + "DC");

        } else if(ortalam1>=40){
            System.out.print("notunuz: " + "DD");

        }else if (ortalam1<=30) {
            System.out.print("notunuz: " + "FF");

        }
    }
}
