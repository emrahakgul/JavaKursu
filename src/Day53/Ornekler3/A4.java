package Day53.Ornekler3;

public class A4 implements IYazdirilabilir, IGosterilebilir{


    @Override
    public void goster() {
        System.out.println(" gösterildi....");
    }

    @Override
    public void yaz() {
        System.out.println(" yazdırıldı....");

    }
}
