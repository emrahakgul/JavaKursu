package Day55.Ornekler.Ornek1;

public class ford extends BinekOto {
    @Override
    public String getMarka() {
        return "Ford Focus";
    }

    @Override
    public int getUretimYili() {
        System.out.println(super.getUretimYili());
        return super.getUretimYili();
    }
}
