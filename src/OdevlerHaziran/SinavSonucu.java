package OdevlerHaziran;

import java.util.Scanner;

public class SinavSonucu {

    public static void main(String[] args) {

        /*Bir öğrencinin notunu belirleyen bir Java programı yazın.

        Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:

        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
        (Notunuz B'dir) */

        Scanner scan = new Scanner(System.in);

        System.out.print("Quiz sonucu: ");
        int quizScore =scan.nextInt();
        System.out.print("Yarı dönem sınav sonucu: ");
        int midTermScore =scan.nextInt();
        System.out.print("Final sonucu: ");
        int finalScore =scan.nextInt();

        int ort=(quizScore+midTermScore+finalScore)/3;

        System.out.println( "Ortalama notun: " + ort);
        System.out.println("Quiz_score:"+ quizScore);
        System.out.println("mid_term_score:"+ midTermScore);
        System.out.println("Final_score:"+ finalScore);

        if (ort>=90)
            System.out.println("Your grade is A");
        if (ort>=70&&ort<90)
            System.out.println("Your grade is B");
        if (ort>=50&&ort<70)
            System.out.println("Your grade is C");
        if (ort<50)
            System.out.println("Your grade is F");


    }
}
