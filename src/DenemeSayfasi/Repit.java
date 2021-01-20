package DenemeSayfasi;

import java.util.Scanner;

public class Repit {
    public static void main(String[] args) {

        /*Trafik cezasının değerini hesaplayın.

        45 hız sınırıdır.
        Eğer hızınız 55-74 arasında ise:        Ceza 100 $'dır.
        Eğer hızınız 75 - 84 arasında ise:      Ceza 150 $'dır.
        Eğer hızınız 85 -94 arasında ise:       Ceza 320 $'dır.
        Eğer hızınız 94'den daha fazla ise:     Ceza 500 $'dır.   ve ayrıca,

        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Hızınızı girin: ");
        int currentSpeed = scan.nextInt();
        System.out.println("Ehliyetiniz Var mı?");
        boolean isDriverLicenceAvailable = scan.nextBoolean();


        if (currentSpeed<=54) {
            System.out.println("");
        }else if (currentSpeed <= 55 && currentSpeed <= 74)
               {
            System.out.println("Ceza 100 $'dır");
        } else if (currentSpeed <= 75 && currentSpeed <= 84){
            System.out.println("Ceza 150 $'dır");
        } else if (currentSpeed <= 85 && currentSpeed <= 94){
            System.out.println("Ceza 320 $'dır");
        } else if (currentSpeed > 94){
            System.out.println("Ceza 500 $'dır");
        }
        if (isDriverLicenceAvailable==false)
            System.out.println("Ehliyetiniz olmadığı için 200 Dolar cezanıza eklenecek");

    }
}
