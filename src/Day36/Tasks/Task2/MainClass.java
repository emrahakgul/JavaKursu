package Day36.Tasks.Task2;
/*
 //Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
 */


public class MainClass {
    public static void main(String[] args) {
        Banka hesap1=new Banka("cari","DE6546465465465",165446);
        Banka hesap2=new Banka("cari","DE6546465465465");
        Banka hesap3=new Banka();
        hesap3.iban="Tr21536456465";


        System.out.println(hesap1);
        System.out.println(hesap2);
        System.out.println(hesap3);


    }



}
