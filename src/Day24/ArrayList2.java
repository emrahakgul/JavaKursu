package Day24;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>(){// dizilerde btanımlarken başlangıç değerler verebiliyorduk
            // ArrayList de de başlangıç değerlerini bir seçenek olarak istersek aşağıdaki gibi verebiliriz
            {
                add("Almanca");
                add("İngilizce");
                add("Türkçe");
                add("Rusça");
            }
        };

        System.out.println("list1 = " + list1);

        ArrayList<String> list2=new ArrayList<>();//Bu yöntem daha klay
        list2.add("Rusça");
        list2.add("Türkçe");
        list2.add("Arapça");

        System.out.println("list2 = " + list2); // Burada diziyi diziden çıkarttık


        list1.removeAll(list2);
        System.out.println("list1 = " + list1);

        list1.addAll(list2); // burda da bir diziyi diğerine ekledik
        System.out.println("list1 = " + list1);
        
        Boolean varmi=list1.contains("Türkçe");
        System.out.println("liste1 de Trkçe varmi = " + varmi);

        // eklenecek listeyi belirtilen indexten itibaren ekler.
        list1.addAll(2,list2);
        System.out.println("list1 = " + list1);


    }
}
