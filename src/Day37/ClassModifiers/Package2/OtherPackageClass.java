package Day37.ClassModifiers.Package2;

import Day37.ClassModifiers.Package1.PublicModifierClass;



//Public diğer yerlerden yani her taraftan erişilir...
public class OtherPackageClass {

    //Dİğer paketten defaultta erişemedik..
    public static void main(String[] args) {

        PublicModifierClass sm3=new PublicModifierClass();
       // DefaultListSelectionModel sm1=new DefaultListSelectionModel();
    }
}
