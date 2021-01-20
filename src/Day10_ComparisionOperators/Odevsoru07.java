package Day10_ComparisionOperators;

import java.util.Scanner;

public class Odevsoru07 {
    public static void main(String[] args) {
        System.out.println("=============================CEVAP 7============================");
        // kullanıcıdan vize final notunu al ortalamayı 0,4 vize + 0,6 final olarak bul
        Scanner input = new Scanner(System.in);
        System.out.print("Vize notu giriniz: ");
        double vizeNot = input.nextDouble();
        System.out.print("Final notu giriniz: ");
        double finalNot = input.nextDouble();

        double ortvize =vizeNot* 0.4;
        double ortfnl =finalNot*0.6;

        double ort =ortvize+ortfnl;

        System.out.println("Ortalama : " + ort);
    }
}
