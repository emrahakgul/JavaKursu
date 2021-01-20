package Day19;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StringSplitMethods {

    public static void main(String[] args) {

        //Kullanıcıdan alacağınız bir cümleyi kelimelerine bölerek alt alta yazdır...

        Scanner sc= new Scanner(System.in);
        System.out.print("bir cümle yaz: ");
        String cümle=sc.nextLine();


        String[] kelime = cümle.split(" "); //boşluk karakerine göre stringlere ayırır...



        for (int i =0; i<kelime.length;i++){
            System.out.println(kelime[i]);
        }
        //2. yöntem
        for (String elemanDegeri : kelime)
        {
            System.out.println(elemanDegeri);
        }

    }

}
