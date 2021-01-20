package Day42_PeriodAndDuration.Manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class _6_LocalDateManipulation {

    //testPlus adında bir test metodu yazınız. Bugünün tarihini alınız. Daha sonra 1 gün,
    // 1 ay ve 1 yıl ekleyerek 2. bir tarih oluşturup bu tarihin sonucunu Assert ile kontrol ediniz


    @Test
    public void testPlus()
    {
        LocalDate bugun=LocalDate.now();
        LocalDate actual=bugun.plusYears(1).plusMonths(1).plusDays(1);

        Assert.assertEquals("Sizin sonucunuz "+actual.toString()+" ama sonuç 2021 08 22 olmalı",  "2021-08-22", actual.toString());
    }

    @Test
    public void testMinus()
    {
        LocalDate bugun=LocalDate.now();
        LocalDate actual=bugun.minusYears(1).minusMonths(1).minusDays(1);

        Assert.assertEquals("Sizin sonucunuz "+actual.toString()+" ama sonuç 2019 06 20 olmalı",  "2019-06-20", actual.toString());
    }
}
