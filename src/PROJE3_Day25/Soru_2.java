package PROJE3_Day25;

import java.util.Scanner;

/*
        Soru 2:
getPopulation:
      main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
      countryNames Ülke isimleri
      countryPopulations Ülke nüfusları

    populationOfCountry adında bir metod yaznız.
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak

    Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
    göndersin.

      Ornegin;
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return 120000 olmali
        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali
         */
public class Soru_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String [] countryNames = {"USA", "Mexico", "Canada", "Turkey", "Germany", "France", "England", "Kongo", "China"};
        int [] countryPopulations = {100000 , 120000 , 130000, 21345, 6545545, 54872135, 212134, 98784, 54};
        System.out.println("Hangi ülkenin  nüfusunu merak ediyorsun?");
        String strnew=sc.nextLine();

        System.out.println(populationOfCountry(countryNames,countryPopulations,strnew));

    }

    public static int populationOfCountry (String [] ulkeler, int [] nufuslar, String ulke) {

        int i;
        for (i = 0; i < ulkeler.length; i++) {
            if (ulke.equalsIgnoreCase(ulkeler[i]))
                return nufuslar[i];
        }
        return -1;
    }
    }


