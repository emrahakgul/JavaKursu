package Mentoring.Temmuz.JavaOOP.Genel;

import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        LinkedHashMap <String, Integer> country=new LinkedHashMap<>();
        country.put("Türkiye", 70);
        country.put("Almanya", 80);
        country.put("Çin", 1650);
        country.put("Kanada", 45);
        country.put("Usa", 450);

        for (Map.Entry<String, Integer> ulke:country.entrySet()){
            System.out.println(ulke);
        }

        System.out.println("------------------1.------------");
        System.out.println("country = " + country);
        System.out.println("------------------2.------------");
        System.out.println("countrykeyset = " + country.keySet());
        System.out.println("------------------3.------------");
        System.out.println("country.values() = " + country.values());
        System.out.println("------------------4.------------");
        System.out.println(country.entrySet());

        System.out.println("------------------5.------------");
        int sum=0;
        for (Integer i:country.values())
             {
          sum+=i;
        }
        System.out.println("ülkelerin toplam nufusu = " + sum);


        System.out.println("-----------------6.----------------------");

        int count=0;
        for (Map.Entry<String,Integer> i:country.entrySet())
        {
            int nufus=i.getValue();
            if (nufus<50){
                count++;
                System.out.println("Nüfusu 50 mil den küçük ülkeler: "+i.getKey()+" "+i.getValue());
            }

        }System.out.printf("50 milyondan küçük kaç ülke = "+ count);

    }

}
