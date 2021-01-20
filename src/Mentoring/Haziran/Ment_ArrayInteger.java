package Mentoring.Haziran;

public class Ment_ArrayInteger {

    public static void main(String[] args) {
          //TODO Integer Arraydeki elemanları for each döngüsüyle topla

        int [] SayiArray ={5,8,35,93,12};
        int toplam=0;
        for (int yenisayi: SayiArray){
            toplam+=yenisayi;

        }
        System.out.println("Toplam: " + toplam);
    }
}
