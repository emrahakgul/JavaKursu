package Day43;

import java.util.Arrays;

/*     String = daha yavas ,Immutable==> degisemez,

            StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
            StringBuffer synchronized,thread safe.

           StringBuilders = mutable==>degisebilir ,
           not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )
*/
public class _01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Bu");
        s.append("gün");
        s.append(" hava ");
        s.append(" çok sıcak");

        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length());
        System.out.println("-----------------------------------------------" );
        s.append(4);
        System.out.println("s = " + s);
        System.out.println("-----------------------------------------------" );
        s.reverse();
        System.out.println("s = " + s);
        System.out.println("-----------------------------------------------" );
        s.reverse();

        s.delete(0, 5);
        System.out.println("s "+ s);
        System.out.println("-----------------------------------------------" );
        s.deleteCharAt(7);
        System.out.println("s = " + s);
        System.out.println("s. length = " + s.length());
        System.out.println("-----------------------------------------------" );
        System.out.println("s.capacity() = " + s.capacity());//hafızada genişleyebilmesi için
        //verilmiş ön alan. ancak eklendikçe artan bir alan .tampon genişleyebilme alanı..

        System.out.println("-----------------------------------------------" );

        s.insert(3, 545); // 3 nolu indexe insert yaptı
        System.out.println("s = " + s);
        System.out.println("-----------------------------------------------" );
        s.insert(5, 3.54);
        System.out.println("s = " + s);
        System.out.println("-----------------------------------------------" );
        int [] dizi={2,3,4,5,506};
        s.delete(0,s.length());
        s.insert(0, Arrays.toString(dizi));
        System.out.println("s = " + s);

        System.out.println("-----------------------------------------------" );

        s.replace(3, 4, "bu");
        System.out.println("s = " + s);
/*
StringBuilder s=new StringBuilder("Bu");

        s.append("gün");  // add gibi ekleme yapıyor bu yüzden tekrar atamaya gerek yok
        s.append(" hava");
        s.append(" çok sıcak");

        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4); // ne eklenirse eklensin hepsi strine dönüşüyor

        s.reverse(); // stringi tersine çeviriyor
        System.out.println("s = " + s);

        s.delete(0,5); // 0 dahil 5 hariç 5 e kadar, olan bölümü sildi.
        System.out.println("s = " + s);

        s.deleteCharAt(3); // sadece 0 indexten itibaren verilen index teki karakteri siler
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());// değişkenin içindeki karakter sayısı
        System.out.println("s.capacity() = " + s.capacity()); // hafızada genişleyebilmesi için
        // verilmiş ön alan, ancak eklendikçe artan bir alan, tampon genişleyebilme alanı

        s.insert(5, "545"); // 5 nolu indexe inset yaptı
        System.out.println("s = " + s);

        s.insert(4, 3.45); // double bile eklenebilir ama strine çevirip ekleyecektir.
        System.out.println("s = " + s);

        int[] dizi={2,3,4,5,506};

        s.insert(6, Arrays.toString(dizi)); // dizi insert edildi.
        System.out.println("s = " + s);

        // burada içeriği yeniledik.
        s=new StringBuilder("Bugünhavaçoksıcak");
        System.out.println("s = " + s);
        s.replace(3,8, "bu"); // başlangıç ve son verilen bölüme verilen stringi atar, eğer verilen büyük ise aradaki
        // bölüm delete olur. üst sınır hariç
        System.out.println("s = " + s);
 */




    }
}
