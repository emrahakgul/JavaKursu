package Day33.Example;

public class Utility {

    public String getString(int value)
    {

    return String.valueOf(value);
    }

    public int getInt(String value)
    {
        return Integer.parseInt(value);
    }
    public double getDouble(String value)
    {
        return Double.parseDouble(value);
    }
    public Boolean getBoolean(String value)
    {
        return Boolean.parseBoolean(value);
    }


//burada yukarıdaki ile aynı şeyleri yazdık ve metod ismini değiştirdim hata olmasın diye bu static olduğu için diğer class ta sınıf ismiyle beraber direk kullanılabilir.....

    public static String getalString(int value)
    {
        return String.valueOf(value);
    }
    public static int getalInt(String value)
    {
        return Integer.parseInt(value);
    }
    public static double getalDouble(String value)
    {
        return Double.parseDouble(value);
    }
    public static Boolean getalBoolean(String value)
    {
        return Boolean.parseBoolean(value);
    }

}
