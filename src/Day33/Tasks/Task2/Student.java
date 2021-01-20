package Day33.Tasks.Task2;

import java.util.ArrayList;

public class Student {

    String name;
    int maxcredit;
    ArrayList<Lessons> dersListesi;


    public int totalCredit ()
    {
    int total=0;
    for (Lessons ders:dersListesi)
    {
    total+=ders.credit;
    }
    return total;
    }


}
