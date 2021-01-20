package Day54.Example;

public interface IElectric extends IVehicle{

    String changeBattery();

    default void print() {

    }
}
