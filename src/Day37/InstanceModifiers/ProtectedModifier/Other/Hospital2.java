package Day37.InstanceModifiers.ProtectedModifier.Other;

import Day37.InstanceModifiers.ProtectedModifier.Same.Doctor;

public class Hospital2 {
    public static void main(String[] args) {
        //proteccted olduğunda default gibi
        // diğer paketlerden kuallnılmıyor.

       //Doctor dr3=new Doctor();
        Doctor dr4=new Doctor("Ömer"); // public olduğu için erişildi...
    }
}
