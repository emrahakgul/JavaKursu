package Day31;

public class Personel {
    int id;
    String name;
    String surName;


    public static void main(String[] args) {
        Personel mudur=new Personel();
        mudur.id=1;
        mudur.name="Mehmet";
        mudur.surName="Yılmaz";

        System.out.println("mudur.id = " + mudur.id);
        System.out.println("mudur.name = " + mudur.name);
        System.out.println("mudur.surName = " + mudur.surName);
    }
}
