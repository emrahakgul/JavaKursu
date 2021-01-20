package Day44;

public class _03_TryCatchFinaly {
    public static void main(String[] args) {


        System.out.println("try bloğuna girmeden çnceki kodlar ");

        try { // hatanın olma ihtimalli olan kodlar try içine
            String str="bugün";
            System.out.println("hatadan önceki adım ");

            char ilkHarf=str.charAt(0);
            System.out.println("hatadan sonraki adım ");
        }
         catch (Exception ex) //hata çıktıktan sonra çalışacak kodlar bu bloğa
        {
            System.out.println("Catch bölümü çalıştı ");
        }
        finally { // bu bölüm hata olsa da olmasa da her zaman çalışır. kodu düzeni açısından kullanılır...
            // kullanım sebebi: try catch in içinde yapılmış işlemlerde arda kalan kapama gibi bu bölüme ait işlemler
            System.out.println("Finaly bölümü çalıştı.");
        }
        System.out.println("tüm hata kodlarından sonraki normal kodların yazıldığı bölüm");
    }
}
