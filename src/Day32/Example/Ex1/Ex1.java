package Day32.Example.Ex1;

public class Ex1 {
    //1. Adım: Person isimli bir class yazınız:fields: name, surname, age; olsun.
    //2. Adım:  main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    //3. Adım: .getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.

    public static void main(String[] args) {
        Person kisi1=new Person();
        kisi1.name = "Yusuf";
        kisi1.surname = "Yılmaz";
        kisi1.age = 35;

        //1.Yöntem oldukça uğraştırıcı
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);

        Person kisi2=new Person();
        kisi2.name = "Ayşe";
        kisi2.surname = "Demir";
        kisi2.age = 30;

        //1.Yöntem oldukça uğraştırıcı
        System.out.println("kisi2.name = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);

        //2.Yöntemin kullanılması : kendi başına yazdır, fakat her nesne için böyle yazarsak oldukça karışır
        BilgiYadir(kisi1); // bu yöntemde parametre göndermek zorun kalıyorum, uğraştırıcı
        BilgiYadir(kisi2);

        //3.Yöntemin main de kullanılması
        kisi1.BilgiYadir(); // bu yöntemde parametre zaten kendisin içinde, büyük kolaylık
        kisi2.BilgiYadir();


        System.out.println("1. kişi doğum yılı: " + kisi1.getBirtyear());
        System.out.println("2. kişi doğum yılı: " + kisi2.getBirtyear());
    }

    //2.Yöntem iyi metod kullandık, fakat
    public static void BilgiYadir(Person kisi)
    {
        System.out.println("metod.name = " + kisi.name);
        System.out.println("metod.surname = " + kisi.surname);
        System.out.println("metod.age = " + kisi.age);
    }


}

class Person
{
    // fields, attributes, properties
    String name;
    String surname;
    int age;

    // methods
    void BilgiYadir()  //3.Yöntem ait olduğu class a ekleniyor ve en iyi yöntemi bulmuş oluyoruz
    {
        System.out.println("kisi.name = " + name);
        System.out.println("kisi.surname = " + surname);
        System.out.println("kisi.age = " + age);
    }
int getBirtyear(){
    return 2020-age;
}


}
