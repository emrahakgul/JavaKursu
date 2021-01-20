package DenemeSayfasi;

public class repit_tersPiramit {
    public static void main(String[] args) {

        /*for(int satir=1; satir<=5; satir++)
        {
            for(int bosluk=satir-1  ; bosluk==0; bosluk--){
                System.out.println(" ");

            for(int star=1; star>=5 ; star++){
                System.out.print("* ");}
            }
        }*/
        for(int satir=1; satir<=5; satir++) // satır kontrol döngüsü
        {
            for(int bosluk=8; bosluk == 0; bosluk--) { // boşluk atan döngü , her satıra göre
                System.out.print("_");


                for (int yildiz = 1; yildiz > bosluk; yildiz++) { // yıldız atan dönü her satıra göre
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }
    }

