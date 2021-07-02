import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
public class Comparison {
   private String path;
    public Comparison (String path){
     //  super();
        Scanner a1 = new Scanner(System.in);
        System.out.println("Please provide file path:-");
        path = a1.nextLine();
        this.path = path;
    }
    public void compare(Comparison x)throws IOException {

        File a1 = new File(path);
        File a2 = new File(x.path);
    //    String directory1 = null;
    //    String directory2 = null;
    //    if (a1.isDirectory()) {
    //         directory1 = directory(a1);
    //    }
    //    if (a2.isDirectory()){
    //         directory2 = directory(a2);
    //    }
    //    if (!directory1.equals(directory2)){
    //        System.out.println("The Directories are not same");
    //    }

        if(a1.length() != a2.length()){
            System.out.println("The Files are not same!");
            return;
        }
        InputStream stream1 = new FileInputStream(a1);
        InputStream stream2 = new FileInputStream(a2);
        int read1;
        int read2;
        boolean same = true;
        while((read1 = stream1.read()) != -1){
            read2 = stream2.read();
            if (read1 != read2){
                same = false;
                break;
            }
        }
        if (same)
            System.out.println("The Files are same!");
        else
            System.out.println("The files are not same!");

//        stream1.read(array1);
//        stream2.read(array2);
//        String s1 = new String(array1);
//        String s2 = new String(array2);
//        if (s1 == s2)
//            System.out.println("The Files are same!");
//
//        else
//            System.out.println("The Files are different!");
        }
    }

