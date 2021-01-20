package Mentoring.Haziran.ArrayMethods;

import java.util.Arrays;

public class Array_Metodlari {
    public static void main(String[] args) {

            //.fill metodu
        //Arraydaki elemanları belirtilen elemenlarla  doldur...


        int[] liste={1,2,5,4,8,4};
        System.out.println("Array ilk hali: " + Arrays.toString(liste));

        //Değiştirilmiş hali
        Arrays.fill(liste,4);
        System.out.println("Array .fill den sonraki hali: " + Arrays.toString(liste));


        // Belli bir aralığı doldurma

        Arrays.fill(liste, 0,4,99);
        //                    0 dan   4 e kadar  değerleri 99 yap

        System.out.println("Belli bir aralığı değiştirilmiş Arrray: " + Arrays.toString(liste));

        //Array SOrt Metodu

        int[] b={45,45,65,89,65,42,98};
        Arrays.sort(b);
        System.out.println("Sıralanmış hali: "+ Arrays.toString(b));


        //Belirli bir aralığı sıralama

        int[] c ={45,89,97,42,13,1,9,4};
        Arrays.sort(c,0,5); // sadece 0 5 arasındakileri sırala

        System.out.println("sadece 0 ile 5 arsı sıralı" + Arrays.toString(c));

        // Stringi sıralama

        String[] karakter={"a","c","z","v","d"};
        System.out.println("Arrays karakter ilk hali: " + Arrays.toString(karakter));


        Arrays.sort(karakter);
        System.out.println("Arrays karakter sıralanmış hali: " + Arrays.toString(karakter));

        // Arrays Equals metodu:

            String[] x={"Techno","Study","Avrupa"};
            String[] y={"Study","Avrupa","Techno"};
            String[] z={"Techo","Study","Avrupa"};

        System.out.println(Arrays.equals(x,z));
        System.out.println(Arrays.equals(x,y));
        System.out.println(Arrays.equals(y,z));

      //  if ();
        System.out.println("------------------------------------");
        //Arrays binarySearch

        int[] d ={45,3,97,42,13,1,9,4};
        int degisken=Arrays.binarySearch(d,3);
        System.out.println("Sıralamadan önce:" + degisken);
        Arrays.sort(d);
        degisken=Arrays.binarySearch(d,7);
        System.out.println(Arrays.toString(d));
        System.out.println("Sıralamadan sonra: "+ degisken );


    }
}
