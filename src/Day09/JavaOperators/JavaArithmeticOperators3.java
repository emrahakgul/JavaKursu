package Day09.JavaOperators;

public class JavaArithmeticOperators3 {
    public static void main(String[] args) {

        //arttırma ve azaltma operatörü

        int a=5;
        int b=2;
        int k=0;

        a++; // a nın değerini 1 arttır demek yani a=a+1
        ++a; // a nın değerini 1 arttır demek yani a=a+1

        k= a++; // ++ lar sağda olduğu içiçn önce k=a çalışır sonra a=a+1
        k=++a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(k);

    }
}
