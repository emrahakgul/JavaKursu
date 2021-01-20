package Day39.Enum.Examp3;

import java.util.ArrayList;

//1 . Bir kitap sınıfı aç ve fields name ve kategori (enum
// 2Kitap kategorileri klasik roman fantezi tarih)
public class Ex3Main {
    public static void main(String[] args) {
        kKitap kit1 = new kKitap();
        kit1.name = "Sefiller";
        kit1.kategori = kKitapKategori.ROMAN;
        kKitap kit2 = new kKitap();
        kit2.name = "Beyaz Zambaklar";
        kit2.kategori = kKitapKategori.EKONOMI;

        ArrayList<kKitap> kitaplar = new ArrayList<>();
        kitaplar.add(kit1);
        kitaplar.add(kit2);
//kitap kategorisi ekonomi olan kitapları yazdır....
        for (kKitap kitaps : kitaplar) {
            if (kitaps.kategori == kKitapKategori.EKONOMI) {
                System.out.println("kitaps = " + kitaps.name);
            }
        }
    }
}