package Day33.Tasks.Task1;

public class MyMath {

    public int tekcift(int value)
    {     if (value<0)
        System.out.println(" Sayı sıfırın altında....");
            else if(value%2==1)
                System.out.println(value + " tek bir sayıdır.");
            else if (value==0)
                System.out.println("Sayı sıfırdır.");
            else
                System.out.println(value+ " çift bir sayıdır");
        return value;
    }

    public int kareal(int value)
    {
        return value*value;
    }

}
