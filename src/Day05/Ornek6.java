package Day05;

public class Ornek6 {
    public static void main(String[] args) {

          //  sayılar arası dönüşüm

        int sayi=5;
        double rakam=55.67;
        rakam = sayi; // oto dönüşüm
        sayi = (int)rakam; // manuel dönüşüm


        // sayıyı stringe

        String yazi = Integer.toBinaryString(sayi);
        String yazi2 =Double.toHexString(rakam);

        System.out.println("sayi Stringe :" + yazi);
        System.out.println("rakam Stringe : " +yazi2);

        /* String den sayıya dönüştürme  (bu daha sonra açıklanacak)

        String yazIile ="25";
        int rakamHali = Integer.parseInt(yazIile);
        int toplam= rakamHali + sayi;
      */














    }
}
