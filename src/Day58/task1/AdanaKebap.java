package Day58.task1;

public class AdanaKebap implements Food{
    void marinade() {
        System.out.println("etler marine ediliyor ");
    }

    public void grill() {
        System.out.println("Mangal hazırlanıyor");

    }

    @Override
    public void taste() {
        System.out.println(" Tadı müthiş ");
    }

    @Override
    public double ücret() {
        return 45.0;
    }
}
