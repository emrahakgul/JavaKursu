package Day07;

public class StringLenght {
    public static void main(String[] args) {

        //1234567890
        String cumle ="Bu gün hava yağmurlu";
                      //bütün karakterlerin aderi boşluklar dahil.
        int uzunluk =cumle.length();

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk = " + cumle.length()); //bu şekilde daha pratik

    }
}
