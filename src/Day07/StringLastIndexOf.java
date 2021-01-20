package Day07;

public class StringLastIndexOf {

    public static void main(String[] args) {

        // String içinde aranan karakterlerin son olarak bulunduğu sırayı verir
        //indexOf un sondan hali fakat index numaraları değişmez yani sayma hep 0 dan başlar



        String text="Good";
        System.out.println("En sondaki o nun indexi: " + text.lastIndexOf("o"));
        System.out.println("ilk baştan o nun indexi: " + text.indexOf("o"));// indexof ile farkı görmek için


        String text2="Eve gidebilir miyim";
        System.out.println("En sondaki i nin indexi: " + text2.lastIndexOf("i")); // 17. sırada
        System.out.println("ilk baştan i nun indexi: " + text2.indexOf("i")); // 4. sırada



    }
}
