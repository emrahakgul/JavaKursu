package Day38.NonAccessModifier.StaticModifier;

public class Simple {
    int a; // olulturulacak nesnenin değişkeni...
   static int b; // direk ulaşılsın diye static yaptık...


    void increase()
    {
        a++;
        b++;
    }


    public static void main(String[] args) {
        Simple ornek =new Simple();
        ornek.a=5;

        Simple ornek2=new Simple();
        ornek2.a=7;

        Simple.b=5;
        Simple.b=9;

       ornek.increase(); // ornek.a 1 artar ve sınıfın b si de 1 artar..
       ornek2.increase(); // ornek 2 nin a sı 1 artar..b.si de 1 artar.

        System.out.println("ornek.a = " + ornek.a);
        System.out.println("ornek2.a = " + ornek2.a);
        System.out.println("simple.b = " + Simple.b);

    }
}
