package Day54.Example;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya değiştirildi";
    }

    @Override
    public String drive() {
        return "Sürüşe Hazır";
    }
}
