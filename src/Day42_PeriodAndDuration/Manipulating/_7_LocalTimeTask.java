package Day42_PeriodAndDuration.Manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class _7_LocalTimeTask {
    //

    @Test
    public void testPlus()
    {
        LocalTime simdi=LocalTime.now();
        LocalTime saateklme=simdi.plusHours(1);
        LocalTime dakikaekle=simdi.plusMinutes(1);

        Assert.assertEquals(22, saateklme.getHour());
        Assert.assertEquals(48, dakikaekle.getMinute());
    }

    @Test
    public void testMinus()
    {
        LocalTime simdi=LocalTime.now();
        LocalTime saatcikar=simdi.minusHours(1);
        LocalTime dakikacikar=simdi.minusMinutes(1);

        Assert.assertEquals(20, saatcikar.getHour());
        Assert.assertEquals(46, dakikacikar.getMinute());
    }


}
