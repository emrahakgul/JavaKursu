package Day07;

public class StringEqualsIgonerCase {
    public static void main(String[] args) {

                 // 2 String büyük küçük karakter ayrımı yapmadan karşılaştırır....sonuc boolean dır

        String str= "Merhaba";
        System.out.println("Eşit mi:" + str.equalsIgnoreCase("merHABA")); // sonuç true
        System.out.println("Eşit mi: "+ str.equalsIgnoreCase("merHa"));

        boolean esitmi =str.equalsIgnoreCase("meRhabA");
        // boolean değişkenine atanabilirç kontol sonucu


    }
}
