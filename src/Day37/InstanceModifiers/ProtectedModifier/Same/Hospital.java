package Day37.InstanceModifiers.ProtectedModifier.Same;

public class Hospital {
    public static void main(String[] args) {
        Doctor dr=new Doctor();
        dr.ad="Ahmet";
        dr.printyap();

        Doctor dr2=new Doctor("Ayşe");
    }
}
