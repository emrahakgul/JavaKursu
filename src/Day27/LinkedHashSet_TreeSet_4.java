package Day27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet_TreeSet_4 {
    public static void main(String[] args) {

        // HashSet, LinkedHashSet, TreSet
        // Hash algoritmasına bağlı sıralamaya göre saklar
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        // Eklenme sırasına göre
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        //Alafabetik soraya göre her eklemede saklar
        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

        // HashSet, LinkedHashSet, TreSet
        // Hash algoritmasına bağlı sıralamaya göre saklar
        HashSet<String> hs_kelime = new HashSet<>();
        hs_kelime.add("ben");
        hs_kelime.add("sen");
        hs_kelime.add("o");
        hs_kelime.add("biz");
        hs_kelime.add("siz");
        System.out.println("hs_kelime = " + hs_kelime);

        // Eklenme sırasına göre
        LinkedHashSet<String> lhs_kelime= new LinkedHashSet<>();
        lhs_kelime.add("ben");
        lhs_kelime.add("sen");
        lhs_kelime.add("o");
        lhs_kelime.add("biz");
        lhs_kelime.add("siz");
        System.out.println("lhs_kelime = " + lhs_kelime);

        //Alafabetik soraya göre her eklemede saklar
        TreeSet<String> ts_kelime = new TreeSet<>();
        ts_kelime.add("ben");
        ts_kelime.add("sen");
        ts_kelime.add("o");
        ts_kelime.add("biz");
        ts_kelime.add("siz");
        System.out.println("ts_kelime = " + ts_kelime);

    }
}
