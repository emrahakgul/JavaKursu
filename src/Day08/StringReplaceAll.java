package Day08;

public class StringReplaceAll {
    public static void main(String[] args) {

        //ReplaceAll replace gibi çalışır ama kriterlere bağlıdır...

        String text="Merhaba Dunya";

        System.out.println("Normal hali:                         " +  text);
        System.out.println("a,b,n lerin _ ile değiştrlmiş hali = " + text.replaceAll("[abn]","_"));
        System.out.println("a,b,n lerin _ ile değiştrlmiş hali = " + text.replaceAll("[a-z]"," "));
    }
}
