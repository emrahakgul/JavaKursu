package Day12_Math_Random;

import java.util.Scanner;

public class Javarandomsoru {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("min ve max bir sayı  gir (arada boşluk olsun): ");
        String min_max=sc.nextLine();
        int bosluknerde=min_max.indexOf(" ");
        String birinci=min_max.substring(0,bosluknerde);
        String ikinci=min_max.substring(bosluknerde+1);

        int ilksayi=Integer.parseInt(birinci);
        int ikincisayi=Integer.parseInt(ikinci);

        int random=(int) ((Math.random()*(ikincisayi-ilksayi)+1)+ilksayi);
        System.out.println("random = " + random);
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("aralikli  iki sayı giriniz: ");
        String min_max = scan.nextLine();

        String min = min_max.substring(0,min_max.indexOf(" "));
        String max = min_max.substring(min_max.indexOf(" ") + 1, min_max.length());

        int min1 = Integer.parseInt(min);
        int max1 = Integer.parseInt(max);

        int num = (int) ((Math.random() * ((max1 - min1) + 1)) + min1);
        System.out.println("num = " + num);
         */
    }
}
