package Day56.Ornekl1;


import org.w3c.dom.ls.LSOutput;

class C{
    public C(){
        System.out.println("C ");
    }
}
class B extends C{
    public B(){
        // super(); yanındaki metod yazılsa da yazılmasa da önce süper constructor cagrılır..
        System.out.println("B ");
    }
}
class A extends B{
    public A(){
        super(); // yanındaki metod yazılsa da yazılmasa da önce süper constructor cagrılır..
        System.out.println("A ");
    }
}

public class Ornek1 {
    public static void main(String[] args) {
        A a=new A();
    }
}
