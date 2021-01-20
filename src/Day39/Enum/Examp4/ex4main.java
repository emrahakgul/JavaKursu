package Day39.Enum.Examp4;

public class ex4main {
    public static void main(String[] args) {

        Months ay=Months.MART;

        System.out.println("günsayisi "+ay.days);
        System.out.println(ay);
        // yukarda ay a mart  değeri verilmil burada gün sayısını bulduk...

          ay.getGunmiktari();
//        switch (ay)
//        {
//            case OCAK: System.out.println("31"); break;
//            case SUBAT: System.out.println("28"); break;
//            case MART: System.out.println("30"); break;
//            case NISAN: System.out.println("31"); break;
//        }
    }
}
