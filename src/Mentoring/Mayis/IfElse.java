package Mentoring.Mayis;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Notunuzu  giriniz: ");
        int not=sc.nextInt();


        if (not>90)
            System.out.println("AA");

        else if (not<85)
            System.out.println("BA");
        else if (not<75)
            System.out.println("BB");
        else if (not<60)
            System.out.println("BC");
        else if (not<45)
            System.out.println("CC");


    }
}
