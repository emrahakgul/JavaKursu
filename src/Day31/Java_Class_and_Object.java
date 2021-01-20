package Day31;

public class Java_Class_and_Object {
    public static void main(String[] args) {
                Araba bmw=new Araba(); // Nesne, Araba sınıfından türetildi...
                bmw.model="5 Series";
                bmw.motorcc=3000;
                bmw.yili=2020;

        System.out.println("Bmw modeli: "+ bmw.model);
        System.out.println("Bmw üretim yılı: " + bmw.yili);
        System.out.println("Bmw motor hacmi: "+ bmw.motorcc);
    }
}
//Araba sınıfı
class Araba{
//Propreties, Attribues, fields
                String model;
                int yili;
                double motorcc;
}