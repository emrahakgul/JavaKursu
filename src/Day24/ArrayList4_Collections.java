package Day24;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4_Collections {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(69);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        System.out.println("numbers = " + numbers);

        Collections.sort(numbers); // Tüm kolaksiyonu sıralar
        System.out.println("Sorted numbers = " + numbers);


        //en büyük değeri bulur
        int max =Collections.max(numbers);
        System.out.println("ENB max = " + max);

        //en küçük değeri bulur
        int min =Collections.min(numbers);
        System.out.println("ENK min = " + min);

        //Listeyi tersine çevirir...
        Collections.reverse(numbers);
        System.out.println("Reversed numbers = " + numbers);

        //Bir değere göre doldurma
        Collections.fill(numbers, 101);
        System.out.println("fill numbers with 101 = " + numbers);

        //Bir değeri yenisiyle değiştrir...
        Collections.replaceAll(numbers,101, 5);
        System.out.println("numbers Replaced with 5 = " + numbers);


    }
}
