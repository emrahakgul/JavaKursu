package Day13_SwitchCase;

import java.util.Scanner;

public class JavaSwitchCase {

    public static void main(String[] args) {
        // kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız...
        //1. gün pazartesi

        Scanner sc=new Scanner(System.in);
        System.out.print("Kaçıncı gün:  ");
        int dayno=sc.nextInt();



        switch (dayno) {
            case 1: System.out.println("Pazartesi");break;
            case 2: System.out.println("Salı");break;
            case 3: System.out.println("Çarşamba");break;
            case 4: System.out.println("Perşembe");break;
            case 5: System.out.println("Cuma");break;
            case 6: System.out.println("Cumartesi");break;
            case 7: System.out.println("Pazar");
            default:
                System.out.println("Sadece 1 ve 8 arası bir sayı girebilirsin");

        }


    }
}
