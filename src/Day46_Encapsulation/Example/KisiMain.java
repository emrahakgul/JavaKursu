package Day46_Encapsulation.Example;

public class KisiMain {
    public static void main(String[] args) {
Kisi kisi1=new Kisi();
kisi1.ad="Ender";
kisi1.soyad="Ömer";
kisi1.setYas(-25);

        System.out.println("kisi1 = " + kisi1.getYas());
    }
}
