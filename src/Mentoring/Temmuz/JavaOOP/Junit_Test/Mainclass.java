package Mentoring.Temmuz.JavaOOP.Junit_Test;

public class Mainclass {
    public static void main(String[] args) {



    }public char  last_Character(String str)
    {
        return str.charAt(str.length()-1);
    }

    public int MaxnumArray(int [] arrdizi)
    {
        int max=0;
        for (int i = 0; i < arrdizi.length; i++) {
         if (max<arrdizi[i])
            max=arrdizi[i];
        }
        return max;
    }

    public int faktoryelbul(int sayi)
    {
        int faktor=1;
        for (int i = 1; i <= sayi; i++) {
            faktor*=i;

        }
        return faktor;
    }

}

