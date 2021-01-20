package Day36.Tasks.Task1;

public class Book {
    String name;
    int publishYear;
    String author;


    public Book( String name, int publishYear, String author)
    {
         this.name=name;
        this.publishYear=publishYear;
        this.author=author;
    }
    public Book( String name, int publishYear)
    {
        this.name=name;
        this.publishYear=publishYear;
        this.author="";
    }
    public Book( )
    {
        this.name="";
        this.publishYear=0;
        this.author="";
    }


    //Bu birinci yazdırma yöntemi:
    public void ShowInfo()
    {
        System.out.println(name+"  "+publishYear+"  "+author);
    }

    //Bu iikinci yazdırma yöntemi:

   public String toString()
   {
       return name+" "+publishYear+" "+author;
   }

    }

