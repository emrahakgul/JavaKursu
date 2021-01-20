package Day11_IF_Else_Logic;

import java.util.Scanner;

public class ifelse2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Vize Notunuzu giriniz: ");
        double vize =sc.nextDouble();

        System.out.print("Final Notunuzu giriniz: ");
        double fnl =sc.nextDouble();

        double ort =(vize*0.40 )+(fnl*0.60)/2;
        System.out.println(ort);

        if (ort>=60)
            System.out.println(" Tebrikler Geçtiniz");
        else
            System.out.println(" Bütünlemeye Kaldınız");

    }
}
