package Day59.Ornek1;

import Day58.task1.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secim;



        System.out.println("Online Banka Hesap Yönetimine Hoş geldiniz");

            System.out.println(" Hesap açmak istediğiniz bankayı seçiniz" +
                    "\n 1. WellFargo"+ "\n 2. Bank of America"+"\n 3. Chase Bank");
            secim = sc.nextInt();
            Scanner sc2=new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
            String isim=sc2.nextLine();
        System.out.println("Telefon numaranızı giriniz: ");
            String phone=sc2.nextLine();
        System.out.println("Adresinizi giriniz: ");
            String adress =sc2.nextLine();




            switch (secim)
            {
                case 1:
                {
                    WellsFargo WellsFargo=new WellsFargo(isim, phone, adress , randomnum());
                    WellsFargo.openAccount();
                        WellsFargo.deposit(0);
                    Scanner sc3=new Scanner(System.in);
                    int secim2;
                    do {


                    System.out.println("Lütfen yapacağınız işlemi seçiniz"+
                            "\n 1. Bakiye"+ "\n 2. Para Yatırma"+"\n 3. Para Çekme"+"\n 4. Kredi Limiti Öğren"+"\n 5. Hesap kapat"+"\n 0. ÇIKIŞ");
                    secim2=sc3.nextInt();
                    switch (secim2){
                        case 1:
                            System.out.println("Bakiyeniz: "+WellsFargo.getBalance() );
                            break;
                        case 2:
                            System.out.println("Hesabınızıa yatırmak istediğiniz miktarı giriniz: ");
                            double yatir=sc3.nextDouble();
                            WellsFargo.deposit(yatir);
                            System.out.println("Hesabınızda şuan "+ WellsFargo.getBalance()+ " Euro vardır.");
                            break;
                        case 3:
                            System.out.println("Hesabınızıdan çekmek istediğiniz miktarı giriniz: ");
                            double cek=sc3.nextDouble();
                            WellsFargo.withdraw(cek);
                            System.out.println("Hesabınızda şuan "+ WellsFargo.getBalance()+ " Euro kaldı.");
                            break;
                        case 4:
                            System.out.println( WellsFargo.loan() + " Euro kredi limitiniz vardır..." );
                            break;
                        case 5:
                            WellsFargo.closeAccount();
                            break;
                        case 0:
                            System.out.println("Sistemden çıkılıyor ");
                            System.out.println("Hesap bilgileriniz...: " +
                                    "\nİsim: " +WellsFargo.getName()+
                                    "\nAdres " +WellsFargo.getAddress()+
                                    "\n Telefon no: " + WellsFargo.getPhoneNumber()+
                                    "\nBakiye :"+ WellsFargo.getBalance());


                    }
                    }
                    while (secim2!=0);
                }
                break;
                case 2:
                {
                    BOA Boa=new BOA(isim, phone, adress , randomnum());
                    Boa.openAccount();

                    break;
                }
                case 3:
                {
                    ChaseBank Chasebank=new ChaseBank(isim, phone, adress , randomnum());
                    Chasebank.openAccount();

                    break;
                }

                default:
                    System.out.println("Seçiminizi lütfen 1 den 5 kadar...");
            }



    }
    public  static int randomnum(){

        return (int)(Math.random()*100+1);
    }
}
