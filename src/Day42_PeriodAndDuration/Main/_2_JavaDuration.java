package Day42_PeriodAndDuration.Main;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class _2_JavaDuration {
    public static void main(String[] args) {

        LocalTime geceYarisi= LocalTime.of(0,0);
        LocalTime oglevakti= LocalTime.of(13,3,2,5);

        Duration fark=Duration.between( geceYarisi,oglevakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toMillis() = " + fark.toMillis());
        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());
        System.out.println("fark.toDays() = " + fark.toDays());

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());
        System.out.println("fark.toMillisPart() = " + fark.toMillisPart());

    }
}
