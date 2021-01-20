package Day11_IF_Else_Logic;

import java.util.Scanner;

public class soruIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Hangi ışık yanıyor? : ");
        String isik =sc.nextLine();
        // bir if te birden falza sout varsa süslü parantez kullan

        if (isik.equalsIgnoreCase("yeşil"))
            System.out.println(" Geçebilirsiniz");
        else if (isik.equalsIgnoreCase("kırmızı"))
            System.out.println("Dur");
        else if (isik.equalsIgnoreCase("sarı"))
            System.out.println("Durmak için yavaşla");
        else System.out.println("Işıklar bozuk Dikkatli geç");
    }
}
