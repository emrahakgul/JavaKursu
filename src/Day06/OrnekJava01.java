package Day06;

import java.util.Scanner;

public class OrnekJava01 {
    public static void main(String[] args) {
     // Kullanıcıdan adını ve soyadını iste
        Scanner sc=new Scanner(System.in);
        System.out.print("Adınızı ve soyadınızı giriniz:");
        String adSoyad=sc.nextLine();// Ekrandan biir satır okuyor.
        System.out.println("Adınız ve Soyadınız: " + adSoyad);

    }
}
