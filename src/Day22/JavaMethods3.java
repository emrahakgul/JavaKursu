package Day22;

public class JavaMethods3 {
    public static void main(String[] args) {
            tekmi_Ciftmi(3);
            tekmi_Ciftmi(4);
            tekmi_Ciftmi(49);

            topla(42,33);
            topla(11,93);
            topla(35642,35543);
    }

    public static void topla(int a, int b)
    {
        System.out.println("Toplam:  " + (a+b));
    }

    public static void tekmi_Ciftmi(int sayi)
    {
        //  int sayi=12;   yukardaki paranteze tanımlamasaydık burada yazmamız gerekirdi...oraya tanımlayıp gene yaaydık...
        if (sayi%2==1)
            System.out.println(sayi +"  Tek bir sayı");
        else
            System.out.println(sayi+ "  Çifttir");
    }
}
