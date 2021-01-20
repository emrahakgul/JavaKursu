package Day05;

public class Ornek8 {

    public static void main(String[] args) {
        // Stringden  sayıya çevirme

        String ekrandanGelen1="500";
        String ekrandanGelen2="1000";

        // int toplamBagıs = ekrandanGelen1 + ekrandanGelen2  bu şekilde toplamı olmaz çünkü bunla sayı değil....


        int bagis1 =Integer.parseInt(ekrandanGelen1);
        int bagis2 =Integer.parseInt(ekrandanGelen2);

        int toplambagis =bagis1+bagis2;

        System.out.println("toplambagis = " + toplambagis);













    }
}
