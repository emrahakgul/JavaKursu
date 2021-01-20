package Day28;

import java.util.HashSet;
import java.util.Set;

// Create method that generates a HashSet of
// given numbers [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
// bu işlemi generateSet() metodunda yapınız.
// -Sonra AddElements şeklind ebir metodlar 1 veya 1 den fazla sayı eklenebilen metodu
// yazınız.
// -Sonra oluşmuş olan maindeki hashSet i convertToArray isimli bir metoda göndererek
// main de bir Array e eşitleyiniz.
// -Sonra oluşmuş olan maindeki hashSet i convertToArrayList isimli bir metoda göndererek
// main de bir ArrayList e eşitleyiniz.
public class Task_1 {
    public static void main(String[] args) {
        Set<Integer> hs1=new HashSet<>();
       generateSet((HashSet<Integer>) hs1);

    }

    public static HashSet<Integer> generateSet(HashSet<Integer> hs)

    {
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(5);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);

        System.out.println("hs:" + hs );
        return hs;
    }


}
