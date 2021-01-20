package Day58.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int siparisno;
        ArrayList<Food> siparis=new ArrayList<>();
        double menüücret = 0;

        System.out.println("TechnoCafe'ye Hoşgeldiniz");
        do{
                System.out.println(" Lütfen Siparişnizi giriniz: " +
                "\n 1. Borsch"+ "\n 2. Adana Kebap"+"\n 3. Lahmacun"+"\n 4. Palov"+"\n 0. TAMAM");
            siparisno = sc.nextInt();

        switch (siparisno)
        {
            case 1:
            {
                Borsch borsch=new Borsch();
                siparis.add(borsch);
                menüücret+=borsch.ücret();
                break;
            }
            case 2:
            {
                AdanaKebap kebap=new AdanaKebap();
                siparis.add(kebap);
                menüücret+=kebap.ücret();
                break;
            }
            case 3:
            {
                Lahmacun lahmacun=new Lahmacun();
                siparis.add(lahmacun);
                menüücret+=lahmacun.ücret();
                break;
            }
            case 4:
            {
                Palov pilav=new Palov();
                siparis.add(pilav);
                menüücret+=pilav.ücret();
                break;
            }
            case 0:
            {
                System.out.println("Menü hazırlanıyor Ücretiniz: " +menüücret  );
                break;
            }
            default:
                System.out.println("Seçiminizi lütfen 1 den 5 kadar...");
        }
        }while (siparisno != 0);
        System.out.println("Ücret: " +menüücret  );
    }
}
