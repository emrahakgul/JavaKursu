package Day46_Encapsulation.Example2;

public class Main {
    public static void main(String[] args) {
        Araba araba1=new Araba();

        araba1.setRenk("Beyaz");
        araba1.setModel("Astra");
        araba1.setMotor(2000);
        araba1.setKapiSayisi(4);

        Araba porsche=new Araba("sarı","911", 4550,2);
        Araba audi=new Araba("siyah","a6", 3200,-4);

        System.out.println(araba1.renk);

        System.out.println("audi = " + audi.getKapiSayisi());



    }
}
