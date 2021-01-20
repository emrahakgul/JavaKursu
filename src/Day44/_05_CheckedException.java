package Day44;

import java.io.FileInputStream;

public class _05_CheckedException {
    public static void main(String[] args) {

        // Dosya okuma/yazma işlemi
        // bu işlemlerde hata olasılığı yüksek olduğundan
        // hata kontrolü zorunlu tutuluyor.
        // bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor.
        // bu gibi surumlara karşılk gelen hatalara Checked Exception denir.
//çzeillkler IO (inputOtput) işlemleri Checked Exxception dır
        try {
            FileInputStream file = new FileInputStream("dosya.txt");
        }
        catch(Exception ex)
        {

        }
    }
    }

