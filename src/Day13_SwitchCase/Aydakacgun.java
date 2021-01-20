package Day13_SwitchCase;

import java.util.Scanner;

public class Aydakacgun {

    public static void main(String[] args) {
        //girilen bir ay numarasına göre kaç gün olduğunu bulma
        Scanner sc = new Scanner(System.in);
        System.out.print("Ay no: ");
        int ayNo = sc.nextInt();
/*
        switch (ayNo) {
            case 1:System.out.pppppppprint("31");break;
            case 2:System.out.print("28"); break;
            case 3:System.out.print("31"); break;
            case 4: System.out.print("30");break;
            case 5: System.out.print("31"); break;
            case 6:System.out.print("30"); break;
            case 7:System.out.print("31"); break;
            case 8: System.out.print("31"); break;
            case 9:System.out.print("30"); break;
            case 10:System.out.print("31"); break;
            case 11: System.out.print("30"); break;
            case 12:System.out.print("31"); break;
            default: System.out.println("Hatalı no!");
        }*/
        //şimdi daha pratik bir yoldan çözelimi
        switch (ayNo)
        {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: System.out.print("31");break;
        case 4:
        case 6:
        case 9:
        case 11: System.out.print("30");break;
        case 2:
                System.out.print("yıl:");
                int yıl=sc.nextInt();
                if (yıl%4==0)
                    System.out.println("29"); // yıl 4 ün katıysa şubat 29 olur
                else
                    System.out.println("28");break; // 4 ün katı değilse 28
            default:
                System.out.println("Hatalı no!");
    }
    }
}
