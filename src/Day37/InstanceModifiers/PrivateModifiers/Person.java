package Day37.InstanceModifiers.PrivateModifiers;

import javax.swing.*;

public class Person {
    int id;
    String name;
    String username;
    private String password;

    public void SifreBelirle(String sifre) {
        if (sifre.length() >= 8) {
            this.password = sifre;
        } else {
            System.out.println("En az 8 karakter olmalı!!!");
        }
    }

    public void SifreGoster() {
        if (this.password != null) {//Burada parolanın sadece  son 3 hanesini yazdırsın dedik...
            System.out.println("***********"+this.password.substring(this.password.length()-3));
        }
    }
}