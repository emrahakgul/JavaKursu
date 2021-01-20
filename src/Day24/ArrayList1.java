package Day24;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // Array : boyut sayısının belli olduğu ve değerlerin çok sık değişitirlmediği durumlarda
        int[] dizi=new int[5]; // Array : Daha sonradan boyutu değiştirlemiyor.

        //Arraylist : boyutu dinamik yani değişken ve değerlerin hızlı değişmesi durumdan daha hızlı...

        ArrayList<Integer> IntegerListe=new ArrayList<>(); // Tanumlama
        ArrayList<String> strListe=new ArrayList<String>(); // 2 . arraylistte deü,iken ismini yazamayabiliriz de
        ArrayList<Boolean> BooleanListe=new ArrayList<>();   // <> arası boş bırakılabilir
        ArrayList<Double> doubleListe=new ArrayList<>();

    // String Arraylist tanımlaması
        ArrayList<String> isimler=new ArrayList<>();
         //Elemann ekleme
        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Kaya");
        System.out.println("İsimler: " + isimler);

        //Belli bir eleman eklendiğinde indexten sonrakiler aşağı kayar...

        isimler.add(1,"Zeynep");
        System.out.println("isimler_add = " + isimler);

        //2 nolu indexteki elemanı verir
        String elemanIndex2=isimler.get(2);
        System.out.println("elemanIndex2_get = " + elemanIndex2);

        //0 indexteki elemanın değerini değiştir.
        isimler.set(0,"Deniz");
        System.out.println("İsimler_set: " + isimler);

        //Eleman sayısını verir...
        int elemansayisi=isimler.size();
        System.out.println("elemansayisi_size = " + elemansayisi);



        //Eleman Silme

        isimler.remove("Ayşe");
        System.out.println("isimler_removw = " + isimler);

        isimler.remove(1);
        System.out.println("isimler_removeind = " + isimler);

        //Bir elemanın indexini bulma
        int indexofKaya=isimler.indexOf("Kaya");
        System.out.println("indexofKaya = " + indexofKaya);

        //Bütün elemanları silme
        isimler.clear();
        System.out.println("isimler_clear= " + isimler);;

        //Listeenin tamamen boş olup olmadığını gösterir
        boolean lisetebosmu=isimler.isEmpty();
        System.out.println("lisetebosmu_isempty = " + lisetebosmu);




    }
}
