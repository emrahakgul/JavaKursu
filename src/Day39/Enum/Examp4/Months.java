package Day39.Enum.Examp4;



public enum Months {
    OCAK(31),  SUBAT(28),
    MART(31), NISAN(30),
    MAYIS(31), HAZIRAN(30),
    TEMMUZ(31), AGUSTOS(31),
    EYLUL(30),
    EKIM(31), KASIM(30),
    ARALIK(31);


    int days;
    // bu bölüm atama yapıldığı zaman çalışır..
    Months(int gunMiktari)
    {
        days=gunMiktari;
    }
    void getGunmiktari()
    {
        System.out.println("days "+days);
    }

}
