package Day13_SwitchCase;

import java.util.Scanner;

public class JavaSwitchGunBulma {

    public static void main(String[] args) {
// bugünden itibaren 100 gün sonra hangi güne denk gelir....
        Scanner sc=new Scanner(System.in);
        System.out.print("Bugünü sayı ile giriniz: ");
        int bugun=sc.nextInt();

        System.out.print("Kaç gün sonrasını bulmak istersin?: ");
        int gunsonra=sc.nextInt();

    int nextday=(gunsonra%7)+bugun;

        switch (nextday) {
            case 1:System.out.println("Pazartesi");break;
            case 2: System.out.println("Salı");break;
            case 3: System.out.println("Çarşamba");break;
            case 4: System.out.println("Perşembe");break;
            case 5: System.out.println("Cuma");break;
            case 6: System.out.println("Cumartesi");break;
            case 7: System.out.println("Pazar");break;
            default:
                System.out.println("Sadece 1 ve 8 arası bir sayı girebilirsin");

        }
    }
}
