package Day42_PeriodAndDuration.Main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _1_JavaPeriod {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();

        Period period3Gun = Period.ofDays(3); //3 günlük bir zaman tutar
        Period ceyrekyil = Period.ofMonths(3); //3 aylık bir zaman tutar


        bugun = bugun.plusDays(3); // 3 bugüne 3 gün ekler
        bugun = bugun.plus(period3Gun); // bu da 3 gün ekler
        bugun = bugun.minus(ceyrekyil); // bu 3 ay eksiltme

        LocalDate kursbaslama=LocalDate.of(2020, 5, 25);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursbitis=kursbaslama.plus(kursSure);

        System.out.println("kursbitis = " + kursbitis.format(DateTimeFormatter.ISO_DATE));
        System.out.println("kursbitis günü = " + kursbitis.getDayOfWeek());

    }
}
