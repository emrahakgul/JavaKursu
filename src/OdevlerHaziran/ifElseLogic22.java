package OdevlerHaziran;

import java.util.Scanner;

public class ifElseLogic22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str  = scan.nextLine();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.


        if(str.length()!=0 && str.contains("i love java")&&str.length()==14)
            System.out.println("String is i love java and 14 character.");
        if(str.length()!=0 && str.equalsIgnoreCase("I love java"))
            System.out.println("String is I love java");
    }
}
