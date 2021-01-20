package Day39.Enum.Examp1;

import jdk.swing.interop.SwingInterOpUtils;

public class Exmp1 {
    public static void main(String[] args) {
        //verilen ay numarasına göre haftanın kaçıncı günü olduğunu yazınız....
        int ayNo=1;

        Aylar_enum ay=Aylar_enum.MART; // int ay=5 gibi;


        System.out.println("ay= "+ ay); // ay=MART asağıdakiler enum un ozelliği
        System.out.println("ay.name()"+ ay.name()); // ay.name() =mart
        System.out.println("ay.ordinal: "+ ay.ordinal()); // ay.ordinal()=2
        switch (ay)

        {
            case OCAK: System.out.println(31); break;
            case SUBAT: System.out.println(28); break;
            case MART: System.out.println(30); break;
            case NISAN: System.out.println(31); break;
            case MAYIS: System.out.println(30); break;

        }
    }
}
