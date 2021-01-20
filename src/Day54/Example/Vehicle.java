package Day54.Example;

public class Vehicle {
private String model;
private double engine;

    public Vehicle(String model, double engine) {
        setModel(model);
        setEngine(engine);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        TeslaCar tesla1=new TeslaCar("P2D", 4.0);
        tesla1.changeBattery();
        tesla1.drive();
tesla1.print();


        ToyotaPrius prius=new ToyotaPrius("prius",3.5);
        prius.changeBattery();
        prius.changeOil();
        prius.drive();

        Bus setra=new Bus("setra",5.0);



    }
}
