package Mentoring.Haziran;

import java.util.Scanner;

public class Ment_Split {
    public static void main(String[] args) {
        // TODO Bir Scanner oluştur bir atasözü yaz her boşlukta  bir split metodu
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Atasözü gir: ");
        String atasozu =sc.nextLine();
        String[] kelime =atasozu.split(" ");

        for (String eleman : kelime){
            System.out.println(eleman);
        }

    }
}
