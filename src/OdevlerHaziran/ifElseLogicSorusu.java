package OdevlerHaziran;

import java.util.Scanner;

public class ifElseLogicSorusu {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.println("Sayı gir: ");
        String str=sc.nextLine();

        if(str.equals("Orange")&&str.length()==6)
            System.out.println( "Orange has six letters");
        else if(str.equals("Apple")&&str.length()==5)
            System.out.println( "Apple has five letters");
        else if(str.contains("Orange")&&str.length()>10)
            System.out.println( "String contain orange and length is more then 10");
    }
}
