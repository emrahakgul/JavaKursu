package Day36.Example;
//bir tür yapısı:class
public class Student {

    int id;
    String name;
    String surname;
    int classroom;


    //Constructor: Yapıcı metod: ilk oluşmada yapılması istenen işlemlerin yazıldığı yer

    public Student(int id,String name,String surname, int classroom )
    {
        //burada 2 tane id olduğu için buradakini kullandığımızı belirtmek için this...
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.classroom=classroom;
       // System.out.println("constructor çalıştı");
    }


    public Student(int id,String name,String surname )
    {

       // this.id=id;
      //  this.name=name;
      //  this.surname=surname;
      //  this.classroom=0;
        this(id,name,surname,0);

    }
    public Student(int id,String name)
    {

      //  this.id=id;
      //  this.name=name;
       // this.surname="";
       // this.classroom=0;
        this(id,name,"",0);

    }
    public Student(int id)
    {

       // this.id=id;
      //  this.name="";
      //  this.surname="";
      //  this.classroom=0;
        this(id,"","",0);

    }
    public Student()
    {

       // this.id=0;
       // this.name="";
      //  this.surname="";
      //  this.classroom=0;
        //şöyle de yapabiliriz:
        this(0,"","",0);


    }

    //2. yçntem için bu
   /* public static Student createStudent(int id, int classroom, String name, String surname)
    {
        Student student1=new Student();

        student1.id=id;
        student1.name=name;
        student1.surname=surname;
        student1.classroom=classroom;

        return student1;
    }*/
}
