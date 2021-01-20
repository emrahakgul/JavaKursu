package Day29;

import java.util.HashMap;
import java.util.Map;

public class HashMap_2 {
    public static void main(String[] args) {

        Map<String,String> userMap=new HashMap<>();
        userMap.put("name","Ahmet Zan");
        userMap.put("email","ahmet@hotmail.com");
        userMap.put("adres","Şişli / İstanbul");
        userMap.put("MobilTel","0 532 2300000");

        System.out.println("userMap.get(name) = " + userMap.get("name"));
        System.out.println("userMap.get(adres) = " + userMap.get("adres"));

        Map<String,String> userMap2=new HashMap<>();
        userMap2.put("name","Ayşe Yılmaz");
        userMap2.put("email","ayşe@hotmail.com");
        userMap2.put("adres","Pendik / İstanbul");
        userMap2.put("MobilTel","0 549 2300000");

        System.out.println("userMap2.get(name) = " + userMap2.get("name"));
        System.out.println("userMap2.get(adres) = " + userMap2.get("adres"));

        Map<String ,Map<String,String>> kartvizit=new HashMap<>();
        kartvizit.put("Ahmet", userMap);
        kartvizit.put("Ayşe", userMap2);

        String ahmetinAdresi=kartvizit.get("Ahmet").get("adres");
        System.out.println("ahmetinAdresi = " + ahmetinAdresi);
        System.out.println("kartvizit.get(Ayşe).get(MobilTel) = " + kartvizit.get("Ayşe").get("MobilTel"));
    }
}
