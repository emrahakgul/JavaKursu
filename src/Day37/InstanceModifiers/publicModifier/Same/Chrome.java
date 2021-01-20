package Day37.InstanceModifiers.publicModifier.Same;

public class Chrome {
    public static void main(String[] args) {
        SearchEngine google=new SearchEngine("hrome");
        google.name="Chrome"; //public

        System.out.println("google "+ google); // tostring metoduna gide o da publci
    }
}
