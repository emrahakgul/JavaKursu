package Day36.Tasks.Task1;
//Ayrı bir Book class aç
//fields name,authot ve publish year
// Kitapların özelliklerini tek bir satırda...yazdıran metod

//3 addet kitabı farklı constructorlarlaoluştur mainde yaz
public class Task1 {
    public static void main(String[] args) {


        Book book1=new Book("Mobi Dick",1934,"Hermann");
        Book book2=new Book("Suç ve Ceza",1916);
        Book book3=new Book();
        book3.name="Vadideki Zambak";
        book3.author="Balzac";
        book1.ShowInfo();
        book2.ShowInfo();
        book3.ShowInfo();//Normalde boş çıkar ama yukarda vadideki zambak diye kitap eklendi

        System.out.println(book1); // toString hepsini aldı
    }
}
