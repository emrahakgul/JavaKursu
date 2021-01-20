package Day19;

import java.util.Scanner;

public class JavaArraySoru_Sayiyitersten {

    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 5 adet sayıyı girii sırasına göre tersten yazdır...

        Scanner sc=new Scanner(System.in);
        int[] sayidizi=new int[5]; // 5 tane ama oda no 0 1 2 3 4

        for(int i=0 ; i<5; i++)
            {
            System.out.print("Sayı gir: ");
            sayidizi[i] = sc.nextInt();
            }
        for (int i =sayidizi.length-1 ;i>=0 ;i--) // sayıyı giriş sırasına göre tersten yazdrımak için
            {
                System.out.println("Sayı: " + sayidizi[i]);

            }
        }




    }


