package Day41.CreatingAndFormatting;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

//Sadece ay gün yıldan oluşan tarih tutar saat dk sn tutmaz
public class java_LocalDate {
    public static void main(String[] args) {

        LocalDate date1=LocalDate.now(); // Burada zamanın sistemin zamanına eşitledik...

        LocalDate date2=LocalDate.of(2019, 7, 20); // Burada belirli bir tarih vrdik...

        LocalDate date3=LocalDate.of(2019, Month.JULY,20);

        System.out.println("date1 get Year= " + date1.getYear());
        System.out.println("date1.getMonth() = " + date1.getMonth());
        System.out.println("date1.getMonthValue() = " + date1.getMonthValue());
        System.out.println("date1 get day of the month= " + date1.getDayOfMonth());
        System.out.println("date1.getDayOfWeek() = " + date1.getDayOfWeek());
        System.out.println("date1.getDayOfYear() = " + date1.getDayOfYear());

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Parantez içindekini kendim seçebiliyorum
        //ama hazır formatlar da var..

        System.out.println(" Tarih format 1 e göre: " +date1.format(format1));

        System.out.println("short date: "+ date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Medium date: "+ date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Long date: "+ date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Full date: "+ date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        // ülkeye göre tarih yazdırmak istersen formatın sonundaki parantezden yukarıdaki komutlardan biri...
        System.out.println("Full date: "+ date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.TRADITIONAL_CHINESE)));


        Locale [] kullanilabilirlerLokaller= Locale.getAvailableLocales();
        for (Locale l: kullanilabilirlerLokaller)
        {
            if (l.getDisplayCountry().toLowerCase().contains("nor"))
            System.out.println("Norveçin tarih zaman değerleri : "+ l+" "+l.getDisplayCountry());
        }

        Locale localeNorvec= new Locale("no","NO");
        System.out.println("Full Date Norveç : "+ date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localeNorvec)));
        // yukarda yeni oluşturduğumuz loacak formatını uygularık










    }
}
