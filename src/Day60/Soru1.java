package Day60;

public class Soru1 {

    public static void main(String[] args) {

        /* insert code here*/
        String[] strs=new String[2];
        int idx= 0;
        for (String s: strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }

    }
}