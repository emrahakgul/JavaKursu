package Day44;

import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try {
            System.out.print("1. sayıyı giriniz: ");
            int a=sc.nextInt();

            System.out.print("2. sayıyı giriniz: ");
            int b=sc.nextInt();

            int c=a/b;
            System.out.println("c = " + c);
        }
        catch (Exception hata)
        {
            System.out.println("Lütdfen sadece sayı gir (0 dan büyük !");
            System.out.println("hata.getmessage "+ hata.getMessage());
            hata.printStackTrace();
        }


    }
}
