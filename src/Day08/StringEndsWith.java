package Day08;

public class StringEndsWith {
    public static void main(String[] args) {
        //Bu komut Bir stringin verilen değer ile bitip bitmediğin söyler...boolean ile ....

        String text="Merhaba Dünya";
        System.out.println("Ya ile biytiyor mu?:" + text.endsWith("Ya"));
        System.out.println("ya ile bitiyor mu?:" + text.endsWith("ya"));
    }
}
