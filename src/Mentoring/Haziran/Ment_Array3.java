package Mentoring.Haziran;

import java.util.Scanner;

public class Ment_Array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //TODO Scanner ile eleman girme

        int[] Array=new int[5];
        //Değerleri girme
        System.out.println("Array Elemanlarını gir: ");
        for (int i=0; i<Array.length; i++)
        {
            Array[i] = sc.nextInt();
        }
        //Array Değerleri yazdırma
        System.out.println("Array değerleri yazdırılıyor: ");
        for (int i=0; i<Array.length; i++){
            System.out.println("Eleman: " + Array[i]);
        }
        //Değerlerin ortalamasını alma
        int toplam=0;
        for (int i=0; i<Array.length; i++){
            toplam=toplam+Array[i];
             }
        int ortalama=toplam/Array.length;
        System.out.println("Array elemanlarının ortalaması: " + ortalama);
    }
}
