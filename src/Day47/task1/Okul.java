package Day47.task1;

import java.util.ArrayList;
import java.util.List;

public class Okul {
    private String okulAd;
    private int maxOgrenci;
    private ArrayList<Ogrenci>ogrencilistesi=new ArrayList<>();

    public Okul(String okulAd, int maxOgrenci) {
        setOkulAd(okulAd);
        setMaxOgrenci(maxOgrenci);

    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenci() {
        return maxOgrenci;
    }

    public void setMaxOgrenci(int maxOgrenci) {
        this.maxOgrenci = maxOgrenci;
    }

    public ArrayList<Ogrenci> getOgrencilistesi() {
        return ogrencilistesi;
    }

    public void setOgrencilistesi(ArrayList<Ogrenci> ogrencilistesi) {
        this.ogrencilistesi = ogrencilistesi;
    }
}
