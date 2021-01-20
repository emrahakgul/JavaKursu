package Day05;

public class Ornek10 {

    public static void main(String[] args) {



        //String olarak veilen bir değeri Booelan true veya flase olarak çevir..

        String a ="True";

        boolean b =Boolean.parseBoolean(a);

        boolean sonuc=b;

        System.out.println("sonuc: " + sonuc);



       //

        String gece ="18";
        String gunduz="40";

        int geceInt =Integer.parseInt(gece);
        int gunduzInt=Integer.parseInt(gunduz);

        int toplam= geceInt + gunduzInt;

        System.out.println("toplam sıcaklık = " + toplam);






    }

}
