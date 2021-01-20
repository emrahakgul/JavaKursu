package Day07;

public class StringReplaceFirst {
    public static void main(String[] args) {
        //Replacefirst komutu Replace ile aynı ama sadece ilk bulunanı değiştirir....


        String text="Merhaba Dünya";
        System.out.println("orjinal hali:  " + text);
        System.out.println("bütün a'ların değiştirilmiş  hali:  " + text.replace('a','e'));
        System.out.println("ilk a'nın değiştirilmiş  hali:  " + text.replaceFirst("a","e"));


    }
}
