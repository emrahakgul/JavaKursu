package Day13_SwitchCase;

import java.util.Scanner;

public class Ifsoru {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Notuzunu giriniz: ");
        String not=sc.nextLine();

        int bosluk=not.indexOf(" ");
        String not2=not.substring(bosluk+1);
        int notsayi=Integer.parseInt(not2); // int ogrNot= Integer.parseInt( dersNot.substring(dersNot.indexOf(" ")+1) );
                      // replace all ile böyle int not = Integer.parseInt(str.replaceAll("[^0-9]",""));
        System.out.println("Notunuz :"+ not2);

        if (notsayi  >= 90)
            System.out.println("A ");
        else if ( notsayi >= 80)
            System.out.println("B ");
        else if ( notsayi >= 70)
            System.out.println("C ");
        else if ( notsayi >= 60)
            System.out.println("D ");
        else if ( notsayi >= 50)
            System.out.println("E ");
        else if ( notsayi <= 40)
            System.out.println("F ");










    }
}
