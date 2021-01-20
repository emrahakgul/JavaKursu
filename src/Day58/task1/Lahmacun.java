package Day58.task1;

public  class Lahmacun implements Food{
    void dough() {
        System.out.println(" dpugh ne ise o yapıldı ");
    }

    void addMeat() {
        System.out.println(" et ekleniyor");
    }

    void bake() {
        System.out.println(" fırına verildi");
    }

    @Override
    public void taste() {
        System.out.println(" tadı olmamış çok yağlı ");
    }

    @Override
    public double ücret() {
        return 15.0;
    }
}
