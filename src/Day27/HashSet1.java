package Day27;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {

        //Array, Arraylist ve "Set" ler
        // SEt ler arraylist gibi çalışır fakat veriyi saklaması tipine göre değişir...
        //Bir tanesi giriş sırasına göre sıralar... diğeri ne yazarsan yaza otomatik sıralar...

        //Collections:
        //HashSet: Kendine göre bir algoritma ile verileri sıralar ve saklar..
        //LinkedHashSet: Kullanıcının ekleme sırasına göre saklar...
        //TreeSet: veri girildiğinde bunları küçükten büyüğe doğru sıralar

        //Arrayliste göre avantaöjı: aynı elemanı iki kez eklemeiyor... arama bulma daha hızlı ....
        // add : Set icersinde bir eleman ekler
        // clear : Set icerisndeki butun elemanlari siler.
        // contains : Bir eleman dizi icinde mi kontrl eder.
        // remove : bir eleman siler
        // size : o ana kadar kac eleman ekledigini dondurur.
        // isEmpty : bos olup olmadigini kontrol eder.
        // containsAll : bellirli bir eleman , set icerisinde var mi yok mu bakiyor
        // addAll : coklu islemler toplu ekleme baska bir kumeyi kumeye ekleme
        // retainAll : iki kumenin kesisimini bulur
        // removeAll : hepsini siler
        // toArray : seti dizi haline getiriyor, dizi formatina cevirme

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println("list = " + list);

        // Set<Integer> hs=new HashSet<>(); //2 türlü de yazılabilir....
        HashSet<Integer> hs=new HashSet<>();
        boolean eklediMi_1=hs.add(1); // true
        boolean eklediMi_2=hs.add(2); // true
        boolean eklediMi_3=hs.add(3); // true
        boolean eklediMi_4=hs.add(3); // Daha önce eklendiği için eklemeyecek sonuç false
        boolean eklediMi_5=hs.add(2); // Daha önce eklendiği için eklemeyecek sonuç false
        System.out.println("eklediMi = " + eklediMi_5);
        System.out.println("eklediMi 2 = " + eklediMi_2);


        System.out.println("hs = " + hs);
    }
}
