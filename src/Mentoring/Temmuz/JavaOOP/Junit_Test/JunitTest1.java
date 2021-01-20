package Mentoring.Temmuz.JavaOOP.Junit_Test;

import org.junit.Assert;
import org.junit.Test;
//Burada main classtaki işlmein testini gerçekleştrcğz...
public class JunitTest1 {
//Assert.assertEquals

    @Test
    public void testLastChar()
   {
       Mainclass m=new Mainclass();
       char result=m.last_Character("JUnit");
       char beklenen='t';
       Assert.assertEquals("Kodunuz hatalı :" ,beklenen,result);//Bu kodun aynısını aşağıya farklı şekilde yazalım
      // Assert.assertEquals('t',m.last_Character("JUnit"));

   }
   @Test
   public void testMaxnumArray()
   {
       Mainclass s=new Mainclass();
       int []arr={1,2,8,4,5,};
       int result=s.MaxnumArray(arr);
       int expected=8;
       Assert.assertEquals("Eminmisin, metodun hatalı olabilir ya da expected değişkenini kontrol et ",result,expected);
   }

   @Test
    public void testFaktor()
   {
       Mainclass m=new Mainclass();
       int number=5;
       int result=m.faktoryelbul(number);
       int expected=120;
       Assert.assertEquals(result,expected);
   }

   @Test
    public void testDeneme()
   {
       String s1="Java";
       String s2="Java";
       boolean b=s1.equals(s2);
       Assert.assertTrue("İki String birbibrine eşit ",b);
   }
}
