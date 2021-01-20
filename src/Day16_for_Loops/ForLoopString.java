package Day16_for_Loops;

import java.util.Scanner;

public class ForLoopString {

    public static void main(String[] args) {


        // Girilen bir stringdeki a harfi sayısını bulunuz.
        // c harfine sıra gelirse döngüden çıkılsın

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=sc.nextLine();

        int aMiktar=0;
        for(int i=0; i< cumle.length(); i++)
        {
            if (cumle.charAt(i) == 'a')
                aMiktar++;
            else
            if (cumle.charAt(i) == 'c')
                break;

            System.out.println("dongü içindeki işleme giren harfler = " + cumle.charAt(i));
        }

        System.out.println("aMiktar = " + aMiktar);
    }

        }


