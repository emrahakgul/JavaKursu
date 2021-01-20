package Day03;

public class JavaDataTypes {
    public static void main(String[] args) {

        byte bDeger =4;
        short sDeger =3000;
        int intDeger =200000;
        long lDeger =1234599999;

        float fDeger=3.14f;
        double dDeger=3.14;

        char cDeger1='A'; // char ın bir tablosu var karşısına yazdığınız her rakam bir karaktere denk gelir...
        char cDeger2=65;
        char cDeger3=97; //a karakteri
        boolean boDeger1=true;
        boolean boDeger2=false;

        System.out.println("byteDeger = " + bDeger);
        System.out.println("sDeger = " + sDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("lDeger = " + lDeger);
        System.out.println("fDeger = " + fDeger);
        System.out.println("dDeger = " + dDeger);
        System.out.println("cDeger1 = " + cDeger1);
        System.out.println("cDeger2 = " + cDeger2);
        System.out.println("cDeger3 = " + cDeger3);
        System.out.println("boDeger1 = " + boDeger1);
        System.out.println("boDeger2 = " + boDeger2);


           //Data Tipleri  :  Primitive ve Non Primitive Tipler
        // byte, short, int, long, float, double, char, boolean : ilkel yani temel tipler
        // Diziler, string, Class : ilkel olmayan tipler,

       /* Tam sayılar için   default int
        127 kadar ise byte,          1 byte
        32767 kadar is short,        2 byte
        2 milyar int,                4 byte
        2 milyar dan büyük ise long, 8 byte

        Ondalıklı sayılar için  default double
        float :  32 bit : noktadan sonra 7 hane tutabiliyor
        double : 64 bit : noktadan sonra 15 hane tutabiliyor.

        char : 65000 e kadar : 2 byte : unicode harfleri saklar  'A'-> 65

        boolean : 1 bit : true, false */








    }
}
