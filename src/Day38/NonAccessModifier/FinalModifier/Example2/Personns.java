package Day38.NonAccessModifier.FinalModifier.Example2;

public class Personns {
    public static void main(String[] args) {
        Personn kisi1=new Personn("Ender",12); // burada fingerprintcode bir kez değer atadık
        // ve bir daha bu değiştrlmz..
     // kisi1.fingerprintCode=13;  burda hata verir... değer zaten aldığı için.

        System.out.println("kisi1 = " + kisi1);

        Personn kisi2=new Personn("Metin",  15);

        System.out.println("kisi2 = " + kisi2);

    }
}
