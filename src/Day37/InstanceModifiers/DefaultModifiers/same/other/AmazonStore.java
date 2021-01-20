package Day37.InstanceModifiers.DefaultModifiers.same.other;

import Day37.InstanceModifiers.DefaultModifiers.same.Book;

public class AmazonStore {

    public static void main(String[] args) {

        // Book kitap1=new Book();  farklı pakette olduğu için fieldslara ulaşılmıyor...

        Book kitap2=new Book("kar");
        //Bu constructora public diye


    }
}
