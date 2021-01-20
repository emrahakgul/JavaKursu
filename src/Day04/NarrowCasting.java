package Day04;

public class NarrowCasting {

    public static void main(String[] args) {
        //// byte -> short -> char -> int -> long -> float -> double ;
        double vergi =6.256;
        int yvergi = (int)vergi; // büyük değişkeni küçüğe çevirince başına int yazmazsan hata verir..

        System.out.println("yvergi = " + yvergi);

        
    }
}
