//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;
public class fileReport {
    public static void main(String args[])throws IOException{
        File file = new File("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\input.txt");
        FileInputStream f = new FileInputStream(file);
        InputStreamReader in = new InputStreamReader(f);
        BufferedReader k = new BufferedReader(in);
        String s;
        int c = 0;
        int space = 0;
        if ((s = k.readLine()) != null){
            String[] wordlist = s.split("\\s+");
            c = wordlist.length;
            space += c - 1;
        }
        System.out.println("space "+space);

    }
}
