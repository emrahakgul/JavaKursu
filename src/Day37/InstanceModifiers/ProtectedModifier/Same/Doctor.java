package Day37.InstanceModifiers.ProtectedModifier.Same;

public class Doctor {
    protected  String ad;
    protected Doctor() {

    }
    public Doctor (String ad){this.ad=ad;}
    protected void printyap() {
        System.out.println("ad = "+ ad);
    }
}
