package Day22;

import java.util.Scanner;

public class dununsorusu {

    public static void main(String[] args) {

        // Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup, çarpımını ekrana yan yana
        // yani 1.matris x 2.matris = sonuç matrisi şeklind eyazdırınız,

        // TODO Auto-generated method stub


        int a=3;
        int b=3;
        int matris1[][]=new int[a][b];
        int matrisb[][]=new int[b][a];
        int sonuc[][]=new int[a][a];
        System.out.println("-----1. matris-----");
        for(int i=0;i<a;i++)

        System.out.println("-----1. matris-----");
        for(int i=0;i<a;i++)
        {
            for(int k=0;k<b;k++)
            {
                System.out.print(matris1[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("-----2. matris-----");
        for(int i=0;i<b;i++)
        {
            for(int k=0;k<a;k++)
            {
                System.out.print(matrisb[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            for(int k=0;k<a;k++)
            {
                for(int j=0;j<b;j++)
                {
                    sonuc[i][k]+=matris1[i][j]*matrisb[j][k];
                }
            }
        }
        System.out.println("----matrisin çarpımının sonucu-----");
        for(int i=0;i<a;i++)
        {
            for(int k=0;k<a;k++)
            {
                System.out.println(matris1[i][k]+ "n"+"  +  "+matrisb[i][k]+ "n"+"  =  "+sonuc[i][k]);

            }
            System.out.println();
        }

    }
}