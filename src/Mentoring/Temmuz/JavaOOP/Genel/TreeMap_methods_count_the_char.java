package Mentoring.Temmuz.JavaOOP.Genel;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//Cümlede tekrar eden harflerin sayısı kaç tekrar
public class TreeMap_methods_count_the_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir cümle yaz: ");
        String cumle=sc.nextLine();

        Map<Character,Integer> frekans = new TreeMap<>();

        for (int i=0; i<cumle.length(); i++) {
            char ilkharf = cumle.charAt(i);

            if (frekans.containsKey(ilkharf)){
               frekans.replace(ilkharf,frekans.get(ilkharf)+1);
            }else
                frekans.put(ilkharf,1);
        }
        System.out.println("frekans = " + frekans);//bu yazım aslında yeterli ama detaylı yazdırmak istersen...aşağıda foreach ile yazdırabilirsn


        for (Map.Entry<Character,Integer>entry: frekans.entrySet()) {
            System.out.println("Karakter " + entry.getKey() + " " + entry.getValue() + " kadar var...");
        }
    }
}
