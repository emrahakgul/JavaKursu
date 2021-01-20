package Day14_DoWhile_LOOPS;

import java.util.Scanner;

public class dowhile2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Program çalışıyor Durdurmak için X e bas");
        String harf;

        do {
            harf=sc.nextLine();
            if (harf.equalsIgnoreCase("x")) break; // break döngü kırıcı Burayı son iki sout beraber yazmasın diye ekledik
            System.out.println("Program çalışıyor Durdurmak için X e bass X");
        }while (!harf.equalsIgnoreCase("x"));
        System.out.println("Aferini sonunda X i buldun...");

    }
}
