package Mentoring.Haziran;

import java.util.Scanner;

public class VizeFinal {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Vize sınav sonucunuzu giriniz :");
        Double vize=sc.nextDouble();
        System.out.print("Vize yüzdesini giriniz :");
        Double vizeYuzde=sc.nextDouble();
        System.out.print("Final sınavı sonucunuzu giriniz :");
        Double fnl =sc.nextDouble();
        System.out.print("Final yüzdesini giriniz :");
        Double fnlYuzde=sc.nextDouble();

        double ort =(vize*vizeYuzde)+(fnl*fnlYuzde);
        System.out.println("Sınav Ortlamanız: "+ ort);
        if (ort==100) {
            System.out.println("Süper, Notunuz: \"AA\" ");}
        else if (ort>=90){
            System.out.println("Notunuz: \"AA\""); }
            else if (ort>=80){
            System.out.println("Notunuz: \"BA\"");}
            else if (ort>=70){
            System.out.println("Notunuz: \"BB\""); }
            else  if (ort>=60){
            System.out.println("Notunuz: \"CB\"");}
            else  if (ort>=50){
            System.out.println("Notunuz: \"CC\""); }
            else  if (ort>=40){
            System.out.println("Notunuz: \"DC\"");}
            else  if (ort>=30){
            System.out.println("Notunuz: \"FF\"  KAlDINIZ");
        }





    }
}
