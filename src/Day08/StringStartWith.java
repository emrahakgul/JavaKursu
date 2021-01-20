package Day08;

public class StringStartWith {


    public static void main(String[] args) {

        //Bu komut Bir stringin bverilen değer ile başlayıp başlamadığını söyler...boolean ile ....

        String text="Merhaba Dünya";
        System.out.println("ME ile başlıyor mu?:" + text.startsWith("ME"));
        System.out.println("Me ile başlıyor mu?:" + text.startsWith("Me"));
    }
}
