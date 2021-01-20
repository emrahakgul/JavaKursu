package Day22;

public class JavaMethods2 {
    public static void main(String[] args) {
        merhabaYaz();

        //System.out.println("ismet");
        ismeMerhabaYaz("ismet"); // burada kaç tane isim tanımlarsanız aşağıda okadar yazar
        ismeMerhabaYaz("Ayşe");
        ismeMerhabaYaz("Ali");
    }

    public static void merhabaYaz()
    {
        System.out.println("Merhaba ");
    }

    public static void ismeMerhabaYaz(String isim)
    {
        System.out.println("Merhaba "+isim);
    }
}

