package Day11_IF_Else_Logic;

import java.util.Scanner;

public class IfElseLogic {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Birşeyler yaz...");
        String cumle=sc.nextLine();

        if (cumle.length()>10 && cumle.contains("study"))
            System.out.println("Evet");
        else System.out.println("Hayır");
    }
}
