package Day31.example.ex1;
// Ayrı bir dosyada studen class tanımla fields name grade
public class Ex1 {
    public static void main(String[] args) {
        Student ogrenci1=new Student();

        ogrenci1.name="Ayşe";
        ogrenci1.grade=3;
        //1. yöntem
        School okulu=new School();
        okulu.adress="Göztepe";
        okulu.name="Marmara Üniversitesi";
        okulu.principalName="Rektör";
        okulu.tuitionFees=0;


        ogrenci1.schoolInfo=okulu;
        //2 yöntem

        ogrenci1.schoolInfo=new School();
        ogrenci1.schoolInfo.adress="Göztepe";
        ogrenci1.schoolInfo.name="Marmara Üniversitesi";
        ogrenci1.schoolInfo.principalName="Rektor";
        ogrenci1.schoolInfo.tuitionFees=0;




        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);
        System.out.println("ogrenci1 school info name = " + ogrenci1.schoolInfo.name);

        Student orenci2=new Student();


    }
}
