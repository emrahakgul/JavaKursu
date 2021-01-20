package Day16_for_Loops;

import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int sayi=sc.nextInt();
        int faktor=1;
        for (int i=1; i<=sayi; i++) {
           faktor=faktor*i; //faktor*=i;



        }
        System.out.println(faktor);
    }
}
