package Day36.Tasks.Task2;

public class Banka {
    String isim;
    String iban;
    int subekodu;

    @Override
    public String toString() {
        return "Banka{" +
                "isim='" + isim + '\'' +
                ", iban='" + iban + '\'' +
                ", subekodu=" + subekodu +
                '}';
    }

    public Banka(String isim, String iban, int subekodu)
    {
        this.isim=isim;
        this.iban=iban;
        this.subekodu=subekodu;
    }

    public Banka( String isim, String iban)
    {
        this.isim=isim;
        this.iban=iban;
        this.subekodu=0;
    }
    public Banka( )
    {
        this.isim="";
        this.iban="";
        this.subekodu=0;
    }


}

