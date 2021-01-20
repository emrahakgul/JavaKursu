package Day16_for_Loops;

import java.util.Scanner;

public class JavaContinueStatement2soru {

    public static void main(String[] args) {

        //kullanıcıdan 5 tane sayıisteyin.
        //bu sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını bulunuz
        //bunu continue ile çözün

        Scanner sc=new Scanner(System.in);

        int toplam=0;

        for (int i=1; i<=5 ; i++){
            System.out.print("sayı giriniz = ");
            int sayi=sc.nextInt();


            if (sayi>5 && sayi<10) {
                continue;
            }
            toplam+=sayi;


    }

        System.out.println(toplam);
    }
}
