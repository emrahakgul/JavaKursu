package Day27;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Ornek {
    public static void main(String[] args) {

        args = new String[]{"1", "2", "3", "3", "1", "15"};



    }
    public void String(String[] args){
        Set s=new HashSet();
        for (int i = 0; i<args.length; i++) {
            if (!s.add(args[i]));
            System.out.println("Duplicate detedcted " + args[i]);
        }
        System.out.println(s.size() + " distinct words detected " + s);
    }

}
