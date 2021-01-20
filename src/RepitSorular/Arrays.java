package RepitSorular;

public class Arrays {
    public static void main(String[] args) {

        String [] Dizi={"Apple", "Orange", "Banana", "Kiwi"};

        System.out.println(java.util.Arrays.toString(Dizi));

        /*
        int Array oluşturun.
        elemanları : 13, 15,14,16,16
         Arrayin elemanlarını yazdırın.
         */
        int [] elemanlar={13,15,14,16,16};
        System.out.println(java.util.Arrays.toString(elemanlar));

        /*
        İnt Array oluştur ve elemanları   : 25,30,30,35,100
        Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
         */
        int [] elemanlar2={25,30,30,35,100};
        int toplam=0;
        for (int i = 0; i <elemanlar2.length ; i++)
        {
           toplam+= elemanlar2[i];
        }
        System.out.println("toplam = " + toplam);



        /*
        String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        Array'daki eleman sayısını yazdırınız.
            Cevap 4 olmalı.
         */
        String [] sehirler={"new jersey", "new york", "boston", "california"};
        System.out.println("sehirler.length = " + sehirler.length);


    }
}
