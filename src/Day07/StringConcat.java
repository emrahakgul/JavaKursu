package Day07;

public class StringConcat {
    public static void main(String[] args) {
        // bir stringi diğerine ekler

        String s="Hi";
        System.out.println(s+ "there!");
        System.out.println(s.concat("there!"));

        String s2=" everbody";
        System.out.println(s.concat(s2));
        System.out.println("s= " + s);

        s=s.concat(s2); // değişkenin kendisine değer atarsam değeri değişir. üstteki örneklerde atanmadı..


    }
}

