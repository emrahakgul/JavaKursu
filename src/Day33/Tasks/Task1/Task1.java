package Day33.Tasks.Task1;

public class Task1 {
    public static void main(String[] args) {


        MyMath islemler=new MyMath();
        int  sayi=159;
        sayi=islemler.tekcift(sayi);


        System.out.println("Sayının karesi: " + islemler.kareal(sayi));

    }
}
