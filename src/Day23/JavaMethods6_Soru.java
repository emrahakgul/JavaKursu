package Day23;
//5 elemanlı bir diziyi kullanıcı doldurduktan sonra
// bir fonksiyonda tek elemanlara 0 değeri atayınız....
// diziyi main de yazdır....


import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods6_Soru {
    public static void main(String[] args) {

        int [] dizi=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<5; i++)
        {
            System.out.println("Sayi giriniz: ");
            dizi[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(teklereSifirAta(dizi)));
        System.out.println();
    }
    public static int[] teklereSifirAta(int[] dizi) // void yerine ne return ediyorsak onun tipini yazarız sadece int değil [] ile...
    {
        for (int i=0; i<dizi.length; i++){
            if (dizi[i]%2==1)
                dizi[i]=0;

        }
        return dizi;
    }

}
