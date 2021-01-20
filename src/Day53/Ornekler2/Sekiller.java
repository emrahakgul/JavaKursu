package Day53.Ornekler2;

public class Sekiller {
    public static void main(String[] args) {
        //bir interface den bir çok class implente edilebilir...

        Cember cember=new Cember();
        Dikdortgen dd=new Dikdortgen();

        cember.ciz();
        dd.ciz();

        //İnterface lerden nesne üretilmez fakat referans tipi oluşturulabilir...
        // bu bize Polymophism sağladı

        ICizilebilir cember2=new Cember();
        cember2.ciz();
    }
}
