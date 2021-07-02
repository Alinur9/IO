import java.io.*;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedWriter;
public class hashmap {
    public static void main(String args[])throws IOException{
        String input = args[0];
        String output = args[1];
        File in = new File(input);
        File out = new File(output);
        FileInputStream wa = new FileInputStream(in);
        //FileOutputStream sa = new FileOutputStream(out);

        int count;
        int total = 0;
        int i;
        int k;
        int space = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        byte [] bytearray = new byte[(int) in.length()];
        wa.read(bytearray);
        String data = new String(bytearray);
        String[] all = data.split("");
        String[] meow = data.split("\\s+");

        k = meow.length;
        space += k - 1;


        for (i = 0; i < all.length; i++){
            total += 1;
        }
        //int product = total + space;

        for (char character : data.toCharArray()){
            if (map.containsKey(character)){
                count = map.get(character);
                map.put(character, count +1);
            }
            else {
                map.put(character, 1);
            }
        }
        BufferedWriter pen = null;
       try {
           pen = new BufferedWriter(new FileWriter(out));
           for (Map.Entry<Character, Integer>entry : map.entrySet()){
               if (entry.getKey() == ' '){
                   int a = 2;
               }

              else{ pen.write(entry.getKey() + " : " + entry.getValue());
               pen.newLine();
              }
           }
           pen.write("Space : " + space);
           pen.newLine();
           pen.write("Total number of characters in the given file (including Space) : "+ total);
           pen.flush();
            //System.out.println(entry.getKey() + " : " + entry.getValue());
        }
       finally {
           pen.close();
           wa.close();
           //sa.close();
       }
    }
}
