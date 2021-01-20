package DenemeSayfasi;

public class repitttt {

    public static void main(String[] args) {

        int a = 5;
        for(int satir =0; satir < 5; satir++){
            for(int bosluk = a; bosluk > 0; bosluk--) {
                System.out.print(" ");


                for (int star = 1; star > 5; star++) {
                    System.out.print("* ");
                }
            }
            System.out.print("* ");
        }
    }
}
