package Day59.Ornek1;
/*
1- abstract Bank sınıfını yazınız,consructor ve tostring metodu olsun.
   void openAccount  (imza, kimlik)
   void closeAccount  (imza , kimlik, hesap kontrol)
   String withdraw
   String deposit
   String loan
   double balance (para yatırılıp çekildiğinde değişsin)

2- Alt 3 subclass ları yazınız. metodlarını içini
   her bankaya özel hesap açılışındaki fakrlı belge isteklerine göre yazınız.

3- BankSistem classındaki main de kullanıcıya hangi bankada hesap açmak istediğini soralım
   bir menü ile. İlgili bankada hesap açtıktan sonra , yine bir menü ile para yatırıp , çeksin,
   işlemi tamamlamak istediğinde (çıkış seçeneği ile) , son bakiyesini ekrana yazalım.
 */


class WellsFargo extends Bank{


    public WellsFargo(String name, String phoneNumber, String address, int numEmployee) {
        super(name, phoneNumber, address, numEmployee);
    }

    @Override
    public void openAccount() {
        System.out.println("Kişisel bilgileriniz alındı...");
        System.out.println( this.getClass().getSimpleName()+" WellFargo Hesabınız kullanıma hazırdır...");
    }

    @Override
    public void closeAccount() {
        System.out.println("Hesap kapatma talebiniz alınştır...");
        System.out.println( this.getClass().getSimpleName()+" Hesabınız kapatılmıştır...");
    }
}

class BOA extends Bank
{

    public BOA(String name, String phoneNumber, String address, int numEmployee) {
        super(name, phoneNumber, address, numEmployee);
    }

    @Override
    public void openAccount() {
        System.out.println("Kişisel bilgileriniz alındı...");
        System.out.println("BOA Hesabınız kullanıma hazırdır...");
    }

    @Override
    public void closeAccount() {
        System.out.println("Hesap kapatma talebiniz alınştır...");
        System.out.println( this.getClass().getSimpleName()+" Hesabınız kapatılmıştır...");
    }
}

class  ChaseBank extends Bank
{


    public ChaseBank(String name, String phoneNumber, String address, int numEmployee) {
        super(name, phoneNumber, address, numEmployee);
    }

    @Override
    public void openAccount() {
        System.out.println("Kişisel bilgileriniz alındı...");
        System.out.println("ChaseBank Hesabınız kullanıma hazırdır...");
    }

    @Override
    public void closeAccount() {
        System.out.println("Hesap kapatma talebiniz alınştır...");
        System.out.println( this.getClass().getSimpleName()+" Hesabınız kapatılmıştır...");
    }
}
public abstract class Bank {
    private String name;
    private String phoneNumber;
    private String address;
    private int numEmployee;
    private double balance;

    String withdraw(double gidenPara) {
        this.balance-= gidenPara;
        return gidenPara +" Euro transfer edildi...";
    }

    String deposit(double gelenPara) {
        this.balance+= gelenPara;
        return gelenPara +" Euro hesaba yatirildi...";
    }

    String loan(){
        return String.valueOf(balance*5);
    }

    public abstract void openAccount();
    public abstract void closeAccount();

    public Bank(String name, String phoneNumber, String address, int numEmployee) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        setNumEmployee(numEmployee);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    public double getBalance() {
        return balance;
    }
}

