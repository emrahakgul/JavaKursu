package Day07;

public class StringSubstring {
    public static void main(String[] args) {

    String text="Merhaba arkadaşlar";
        System.out.println("1.bölüm : " + text.subSequence(1,5)); // erha ..... 1 nolu indexten 5e kadar 5 dahil değil...
        System.out.println("2.bölüm : " + text.subSequence(0,3)); // Mer



        System.out.println("3.bölüm : " + text.substring(4)); // 4ten itibaren olanlar... 4dahil yani "aba arkadaşlar" çıkar
    }
}
