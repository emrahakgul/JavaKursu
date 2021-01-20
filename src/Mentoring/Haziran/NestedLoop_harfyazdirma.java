package Mentoring.Haziran;

public class NestedLoop_harfyazdirma {

    public static void main(String[] args) {

        // A
        // A B
        // A B C
        // A B C D
        // A B C D E
        // A B C D E F

        for(char i=65; i<=71; i++){

            for(char j=65; j<i; j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
}
