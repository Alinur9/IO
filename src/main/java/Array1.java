import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Array1 {
    public static void main(String args[]){
        String a1 = "abcdef";
        int j = a1.length();
        String [] array = {"abc","def","ghi"};
        Arrays.sort(array);
        Vector v = new Vector();
        v.add("abc");
        v.add("def");
        v.add("ghi");
        Collections.sort(v);
        for (int k = 0; k < array.length; k++){
         //   System.out.println(array[k]);
        }
        for (Object k : v){
            String s1 = k.toString();
            System.out.println(s1);
        }


        }

    }

