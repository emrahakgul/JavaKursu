package Day38.NonAccessModifier.FinalModifier.Example2;

public class Personn {
    String name;
    final int fingerprintCode;

    public Personn(String name, int fingerprintCode) {
        this.name = name;
        this.fingerprintCode = fingerprintCode;
    }

    // final değişkenlerine ilk değer atama işlemi direk
    // yapılabildiği gibi constructorla da atanabilir.
    // ancak daha sonra yine değeri değiştirilemez.
    // bu işlem ilk değer atama için geçerli.



    @Override
    public String toString() {
        return "Personn{" +
                "name='" + name + '\'' +
                ", fingerprintCode=" + fingerprintCode +
                '}';
    }
}
