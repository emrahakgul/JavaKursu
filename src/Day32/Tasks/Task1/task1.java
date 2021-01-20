package Day32.Tasks.Task1;

public class task1 {
    public static void main(String[] args) {
// 1-Adım Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
// 2-Çevre bulmak üzere getPerimeter isminde bir metod yazını<...

        Rectangle dikdortgen=new Rectangle();
        dikdortgen.width=5;
        dikdortgen.length=4;
        System.out.println("dikdortgen çevresi = " + dikdortgen.getPrimeter());
        System.out.println("diktördten alanı: "+ dikdortgen.getArea());

    }
}
