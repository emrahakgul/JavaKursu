package Day46_Encapsulation.Example;

public class Kisi {
    String ad;
    String soyad;
    private int yas;

    public void setYas(int yas) {
        this.yas = Math.abs(yas);

        // 2.yöntem
//        if (yas > 0 ) {
//            this.yas = yas;
//        }
//        else
//        {
//            this.yas = -yas;
//        }
    }

    public int getYas() {
        return this.yas;
    }
}
