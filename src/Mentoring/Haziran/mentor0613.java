package Mentoring.Haziran;

import java.util.Scanner;

public class mentor0613 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Derece giriniz: ");
        double derece = sc.nextDouble();


        if (derece > 40) {

            System.out.println("Dışarısı çok sıcakmış....  ");
            System.out.println("Peki güneşli mi? : ");
                boolean gunes = sc.nextBoolean();
                if (gunes == true)
                    System.out.println(" aynı zamanda güneşli");
                else System.out.println(" ve bulutlu");
            }
            else
            System.out.println("Dışarısı sıcak değil...");
        }
    }
