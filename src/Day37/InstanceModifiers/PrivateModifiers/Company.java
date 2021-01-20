package Day37.InstanceModifiers.PrivateModifiers;

public class Company {

    public static void main(String[] args) {
        Person personel=new Person();
        personel.id=1;
        personel.name="Ahmet";
        personel.username="akg";
        //personel.password="12345"; //  pasword public ya da default olsaydı ulaşılırdı ama bunu private yapacağaız..

        personel.SifreBelirle("12jugh56a9c5");
        personel.SifreGoster();

    }
}
