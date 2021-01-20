package Day43;

import java.time.LocalDate;
import java.time.Month;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

            try { // dene, hatanın başladığı yerin üstüne konur
                LocalDate date = LocalDate.of(2018, Month.APRIL, 4);
                System.out.println(" işlem tamam");
            } // hatanın bittiği yerde parantez kapatılır
            catch(Exception hata) // hata olduğunda yapılacak işlemler burdan aşağıda parantez arasına yazılır.
            {
                // hata olduğunda en yazpılacağı buraya yazılıyor.
                System.out.println("hata oldu");
                System.out.println("hata: " +   " tarih dönüşüm hatası");

            }

            System.out.println("Programın sonuna kadar gelindi.");
        }
    }

