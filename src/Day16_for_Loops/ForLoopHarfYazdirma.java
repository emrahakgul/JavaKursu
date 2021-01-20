package Day16_for_Loops;

public class ForLoopHarfYazdirma {

    public static void main(String[] args) {

        String deger= " Araba";
        for (int i=0; i<deger.length(); i++){
            char harfler =deger.charAt(i);
            System.out.println(harfler);
        }
    }
}
