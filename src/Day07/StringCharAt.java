package Day07;

public class StringCharAt {
    public static void main(String[] args) {
           // İstenen noktadaki harfi verir...
        
        String kelime ="Merhaba Dünya";
        
        char harf =kelime.charAt(5); //5. sıradaki harf...saymaya 0 dan başladığı için dikkat etmek gerek
        System.out.println("3. harf = " + harf);

        harf=kelime.charAt(0);
        System.out.println("0.harf = " + harf);

    }
}
