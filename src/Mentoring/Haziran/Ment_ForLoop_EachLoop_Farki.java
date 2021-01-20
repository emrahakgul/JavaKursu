package Mentoring.Haziran;

public class Ment_ForLoop_EachLoop_Farki {

    public static void main(String[] args) {
        // TODO for loop each loop Farkı
        String[] StringArray={"Alpha", "Beta", "Gamma", "Delta"};
        //For loop ile yazdırma
        System.out.println("For Loop: " );
        for (int i=0; i<StringArray.length; i++){
            System.out.println(StringArray[i]);
        }
        // For each ile yazdırma
        for (String Str :StringArray){
            System.out.println(Str);
        }
    }
}
