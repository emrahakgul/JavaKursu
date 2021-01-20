package Day54.Example;

public class ToyotaPrius extends Vehicle implements IGas,IElectric{

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya değiştirildi";
    }

    @Override
    public String changeOil() {
        return "Yağ değiştirldi";
    }

    @Override
    public String drive() {
        return "Araç sürüşe ehazır";
    }
}
