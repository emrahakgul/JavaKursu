package Day33.Example;

public class JavaStaticAnd_NonStaticMethods {
    public static void main(String[] args) {

        //bütün programlarda tip dçnüşümleri içiçn metodlara ihtiyaç var
        // mesela int to string , string to int ..vs vs bunları yapan bir sınıf yazınız...
        // ve bunları main kullanarak gösteriniz.

        //1. YÖNTEM   klasik dönüşümler.....metod olmadan
        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);
        //. 2. YÖNTEM static olmayan bir sınıftan new yazıp çağırıyoruz..

        Utility cevir=new Utility();
        strRakam=cevir.getString(sayi);
        intRakam=cevir.getInt(strRakam);

        //3. YÖNTEM
        //yeniden oluşturmadığımız sınıfın direk adı ile...new Utility demye gerek yok...
        strRakam=Utility.getalString(sayi);
        intRakam=Utility.getalInt(strRakam);

        //Aynı math sınıfı gibi
        Math.random(); // bu javanın içinde oluşturulmuş bizim oluşturduğumuz utility sınıfı gibi....


    }
}
