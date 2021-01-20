package Day08;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        //

        System.out.print("Adınızı ve soyadınızı giriniz: ");
        Scanner sc =new Scanner(System.in);
        String ad=sc.nextLine();

        char ilkharf=ad.charAt(0);
        int bosluk =ad.indexOf(" ");
        int sonbosluk=ad.lastIndexOf(" ");
        char adikiharf =ad.charAt(bosluk+1);
        char soyadilkharf =ad.charAt(sonbosluk+1);

        System.out.println(ilkharf +"."+adikiharf+"."+soyadilkharf);

    }

}
