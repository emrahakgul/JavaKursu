package Day38.NonAccessModifier.FinalModifier.Example3;

public class Ex3 {
    final String name;

    public Ex3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Ex3 ornek1=new Ex3("Ayşe");
        Ex3 ornek2=new Ex3("Ali");

        //ornek1.name=" asd";  hata
        //ornek2.name=" fsasd";  hata
        //final değer zaten atandı

        System.out.println("ornek1 = " + ornek1);
        System.out.println("ornek1 = " + ornek2);
    }
// toString yazmaassaydık yukarda sout içine ornek1.name yazamamız gerekirdi..
    @Override
    public String toString() {
        return "Ex3{" +
                "name='" + name + '\'' +
                '}';
    }
}
