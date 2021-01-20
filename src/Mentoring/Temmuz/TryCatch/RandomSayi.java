package Mentoring.Temmuz.TryCatch;
/*
 randomSayi isminde static void bir method oluşturun.
        Bu method içerisinde iki int random sayı oluştusun. (0'dan 10 a kadar)
        Bu iki random sayının toplamını yazdırın.
        Eğer bu iki random sayı 12 den küçükse "Exception" versin ve mesaj olarak ("Sayı 12'den küçük ise hata verir") yazsın.
        Methodu main methodunda çağırın ve kodun düzgün çalışmasını sağlayın. (Aksaklığı giderin)
 */
public class RandomSayi {
    public static void main(String[] args) {
        for (int i = 1; i <1000 ; i++) { // buraya kendim bir for ekledimki kaçıncı denemede 65 geliyor göreyim diye
            int a= (int) (Math.random()*15+1);
            int b= (int) (Math.random()*50+1);
            try {
                random(a, b);
                if (a+b==65) {
                    System.out.println(i + "sayi 65");
                    break;
                }
            } catch (Exception ex) {
                System.out.println("ex = " + ex);
            }
        }




    }
    static void random(int a, int b) throws Exception {
        int toplam=0;
        toplam = a + b;

         if (toplam<12)
        {
            throw new Exception("Toplam 12 den küçük");
        }
         else System.out.println("toplam: " + toplam);





    }
}
