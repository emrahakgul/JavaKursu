package Day58.task1;

public class Palov  implements Food {

    public void boil() {
        System.out.println(" Kaynatılyor ");
    }

    public void fry() {
        System.out.println(" Kızartıldı ");
    }

    @Override
    public void taste() {
        System.out.println(" tatsız olmş");
    }

    @Override
    public double ücret() {
        return 22.0;
    }
}
