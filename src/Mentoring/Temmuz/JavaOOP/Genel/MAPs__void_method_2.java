package Mentoring.Temmuz.JavaOOP.Genel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAPs__void_method_2 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedhashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("----------------------------TREEMAP--------------------------------------");
        printMap(treeMap);
        System.out.println("------------------------LİNKEDHASHMAP-------------------------------------------");
        printMap(linkedhashMap);
        System.out.println("------------------------HASHMAP-------------------------------------------");
        printMap(hashMap);

    }

    public static void printMap(Map<Integer, String> hshmap) {

        hshmap.put(10, "Java");
        hshmap.put(20, "PHP");
        hshmap.put(2, "Python");
        hshmap.put(57, "C++");
        hshmap.put(89, "C#");
        hshmap.put(40, "JavaScript");

        for (Map.Entry<Integer, String> entry : hshmap.entrySet()) {
            System.out.println("Keys :" + entry.getKey() + " value " + entry.getValue());
        }
    }
}