package Day37.InstanceModifiers.DefaultModifiers.same;

public class BookStore {
    public static void main(String[] args) {

        Book kitap1=new Book();
        kitap1.name="Lord of the Rings";

        //Zaten public sınır yok
        Book kitap=new Book("Kar");

    }
}
