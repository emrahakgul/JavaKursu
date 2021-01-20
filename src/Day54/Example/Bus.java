package Day54.Example;

public class Bus extends Vehicle implements IDiesel{

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Depo dolduruldu";
    }

    @Override
    public String drive() {
        return "Sefer başlıyor";
    }
}
