package Day38.NonAccessModifier.StaticModifier;

public class Stu_dent {

   int id;
    String name;
    String surName;

    static int ogrencisayisi=0;
    //Ogrenci sayısını bulmak için burda static atadık
    // metod iç.içnde artıtracak

    public Stu_dent(String name, String surName) {
        this.name = name;
        this.surName = surName;

        ogrencisayisi++;
        this.id=ogrencisayisi*13+6; // öğrenci numarası verdik
        // numarayı herhangi bir işlem sonrası verdirdik
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Surname='" + surName + '\'' +
                '}';
    }
}
