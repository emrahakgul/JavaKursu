package Day16_for_Loops;

import java.util.Scanner;

public class JavaContinueStatement {

    public static void main(String[] args) {
        //Girilen bir Stringin harflerinin teker teker ekrana altalta olacak şekilde yazdır..Boşluk veya a harfi geldiğinde bunları yazmasın...
        // break kes cntinue atla devam et demek
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=sc.nextLine();

        for (int i=0; i<cumle.length(); i++){
            if (cumle.charAt(i)=='a'|| cumle.charAt(i)==' ')
                continue; // continue çalıştığı sürece artışa direk gider
            System.out.println(cumle.charAt(i));
        }

    }
}
