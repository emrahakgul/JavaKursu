package Day46_Encapsulation.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int miktar=0;
        Scanner oku=new Scanner(System.in);
        boolean usernameIste=true;
        String username="";
        String password="";

        do{

            if (usernameIste) {
                System.out.print((miktar + 1) + ".User Name=");
                username = oku.nextLine();
            }

            System.out.print("Password=");
            password=oku.nextLine();

            try {
                User yeniUser = new User(username, password);
                miktar++;
                usernameIste=true; // hata olmadığında bir sonraki kullanıcı için username istenecek
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
                usernameIste=false; // hata lduğu durumda tekrar username isteme
            }

        }while(miktar <6);
    }
}
