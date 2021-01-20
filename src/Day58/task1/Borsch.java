package Day58.task1;

public  class Borsch implements Food {
    void boil() {
        System.out.println(" kayanatıılıyor ");
    }

    void eatTomorrow() {
        System.out.println(" kalanı yarın yenilecek ");
    }

    @Override
    public void taste() {
        System.out.println(" tadı çok iyi ");
    }

    @Override
    public double ücret() {
        return 30.0;
    }
}
