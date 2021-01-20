package Mentoring.Mayis;

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
       // 2 vize bunların ort yüzde 30 ve final yüzde 70
        System.out.print("1. vize sonucu; ");
        double vize1 =sc.nextDouble();

        System.out.print("2. vize sonucu; ");
        double vize2 =sc.nextDouble();

        System.out.print("Final sonucu; ");
        double fnl= sc.nextDouble();

        double ortvize =((vize1+vize2)/2)* 0.3;
        double ortfnl =fnl*0.7;

        double ort =ortvize+ortfnl;

        System.out.println("Ortalama : " + ort);


    }
}
