package Mentoring.Temmuz.JavaOOP.Genel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class treeMap_1 {
    public static void main(String[] args) {
        Map<Integer,String>hashMap=new HashMap<>();
        Map<Integer,String>linkedhashMap=new LinkedHashMap<>();
        Map<Integer,String>treeMap=new TreeMap<>();

        //Map larin farkını görmek için aynı değerlere sahip keyleri yazdıralım..
        System.out.println("------------------------HASHMAP-------------------------------------------");
        hashMap.put(10, "Java");
        hashMap.put(20, "PHP");
        hashMap.put(2, "Python");
        hashMap.put(57, "C++");
        hashMap.put(89, "C#");
        hashMap.put(40, "JavaScript");

        for (Map.Entry<Integer,String>entry:hashMap.entrySet()){
            System.out.println("Keys :" + entry.getKey()+ " value "+ entry.getValue());
        }

        System.out.println("------------------------LİNKEDHASHMAP-------------------------------------------");
        linkedhashMap.put(10, "Java");
        linkedhashMap.put(20, "PHP");
        linkedhashMap.put(2, "Python");
        linkedhashMap.put(57, "C++");
        linkedhashMap.put(89, "C#");
        linkedhashMap.put(40, "JavaScript");

        for (Map.Entry<Integer,String>entry:linkedhashMap.entrySet()){
            System.out.println("Keys :" + entry.getKey()+ " value "+ entry.getValue());
        }
        System.out.println("----------------------------TREEMAP--------------------------------------");


        treeMap.put(10, "Java");
        treeMap.put(20, "PHP");
        treeMap.put(2, "Python");
        treeMap.put(57, "C++");
        treeMap.put(89, "C#");
        treeMap.put(40, "JavaScript");

        for (Map.Entry<Integer,String>entry:treeMap.entrySet()){
            System.out.println("Keys :" + entry.getKey()+ " value "+ entry.getValue());
        }

    }
}
