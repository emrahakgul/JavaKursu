package Day26;

import java.util.ArrayList;

public class Java__2D_ArrayList {
    public static void main(String[] args) {

        /***********************/
        int sayi=5; // tek bir rakam saklayabilen değişken
        int[] dizi=new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] mat2=new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<Integer> arrList=new ArrayList<Integer>(); // istenildiği kadar değişken eklenebilir
        /***********************/


        int[][] mat=new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<  ArrayList<Integer>  >  notlarArrList = new ArrayList<>();
        // boşluklar gereksi sade gözükebilsin diye yapıldı.

        ArrayList<Integer> matNotlar=new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar=new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar=new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);

        notlarArrList.add(matNotlar); // burada tanımalamada neyin listesi ise ona uygun değişkeni Ekledik
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);

        System.out.println("notlarArrList = " + notlarArrList);

        for (int i = 0; i<matNotlar.size(); i++)
        {
            System.out.println("matNotlar= " + matNotlar.get(i));
        }
        for (int i = 0; i <turNotlar.size() ; i++)
        {
            System.out.println("turNotlar = " + turNotlar.get(i));
        }
        for (int i = 0; i <kimNotlar.size() ; i++)
        {
            System.out.println("kimNotlar = " + kimNotlar.get(i));
        }

        for (int i = 0; i <notlarArrList.size() ; i++) // bu şekilde hepsini birden de yazabiliriz....
        {

            System.out.println("notlarArrList = "+ notlarArrList.get(i));}

        System.out.println("notlararrlist size : " + notlarArrList.size());



    }
    public static void ortalama(ArrayList<Integer> one){

        one = new ArrayList<>();
        for (int i = 0; i <one.size() ; i++) {




        }
    }
}
