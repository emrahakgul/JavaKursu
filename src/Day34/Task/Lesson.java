package Day34.Task;

public class Lesson {
    String name;
    int hour;





    // return döndürme varsa yoksa void li olur metod
    public static Lesson dersOlusturma(String name,int hour){
        Lesson ders=new Lesson();
        ders.name=name;
        ders.hour=hour;

        return ders;
    }


}

