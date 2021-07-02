import javax.imageio.IIOException;
import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Directory1 {
    public String path;
    public Directory1(String path) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide File/Directories path:-");
        path = scan.nextLine();
        this.path = path;
    }
    Vector v = new Vector();
    String string1 = new String();
    String compare1 = new String();
    String compare2 = new String();
    String names1 = new String();
    String total = new String();
    Vector s = new Vector();

    public Vector getString(File a1) throws IOException {

        boolean z = a1.isDirectory();
        if (z) {
            File[] children = a1.listFiles();
            for (File child : children) {
                if (child.isDirectory()) {
                    getString(child);
                } else {
                    s.add(child.getName()+",");
                    Collections.sort(s);
                    }
                  //  string1 += child.getName()+",";
                  //  v.add(child.getAbsolutePath());

                }
            }

        return s;
    }
    public Vector directory(File a1) throws IOException {
        boolean z = a1.isDirectory();
        if (z) {
            File[] children = a1.listFiles();
            for (File child : children) {
                if (child.isDirectory()) {
                    directory(child);
                } else {
                 ///   string1 += child.getName();
                    v.add(child.getAbsolutePath());
                }
            }
        }
        return v;
    }
    public String getNames(String path) throws IOException {
        File a1 = new File(path);
        Vector s1 = getString(a1);
        for (Object children : s1){
            compare1 = children.toString();
           total += compare1;
        }
       //System.out.println(total);
        return total;

    }
    public String getNames2(String path1) throws IOException {
        File a2 = new File(path1);
        s = new Vector();
        Vector s2 = getString(a2);
        for (Object children6 : s2){
            compare2 = children6.toString();
            names1 += compare2;
        }
        //System.out.println(names1);
        return names1;

    }
    public Vector getVector(String path) throws IOException {
        File a1 = new File(path);
        v = directory(a1);
        return v;
    }
    public void compare(Directory1 x) throws IOException {
        try {
            File a1 = new File(path);
            File a2 = new File(x.path);
            boolean checkType1 = a1.isDirectory();
            boolean checkType2 = a2.isDirectory();
            System.out.println("\nChecking File/Directory types..");
            if (checkType1 != checkType2) {
                System.out.println("The File/Directory types are not same!");
                return;
            }
            if (checkType1 && checkType2) {
                System.out.println("Comparing Two Directories.... \n");
                 string1 = getNames(path);
                String string2 = getNames2(x.path);
                if (!string1.equals(string2)) {
                    System.out.println("The Directories not same!");
                    return;
                }
                Vector v1 = x.getVector(x.path);
                v = getVector(path);
                int len1 = v.size();
                int len2 = v1.size();
                if (len1 != len2) {
                    System.out.println("The Directories are not same!");
                    return;
                }
                boolean same = true;
                for (Object children1 : v) {
                    String s1 = children1.toString();
                    File file1 = new File(s1);
                    InputStream stream1 = new FileInputStream(file1);
                    for (Object children2 : v1) {
                        String s2 = children2.toString();
                        if (children1 != children2)
                            continue;
                        File file2 = new File(s2);
                        InputStream stream2 = new FileInputStream(file2);
                        int read1;
                        int read2;
                        while ((read1 = stream1.read()) != -1) {
                            read2 = stream2.read();
                            if (read1 != read2) {
                                same = false;
                                stream1.close();
                                stream2.close();
                                break;
                            }
                        }
                    }
                }
                if (same) {
                    System.out.println("The Directories are same!");
                } else {
                    System.out.println("The Directories are not same!");
                }
            } else {
                System.out.println("Comparing two Files!....\n");
                if (a1.length() != a2.length()) {
                    System.out.println("The Files are not same!");
                    return;
                }
                InputStream stream1 = new FileInputStream(a1);
                InputStream stream2 = new FileInputStream(a2);
                int read1;
                int read2;
                boolean same = true;
                while ((read1 = stream1.read()) != -1) {
                    read2 = stream2.read();
                    if (read1 != read2) {
                        same = false;
                        stream1.close();
                        stream2.close();
                        break;
                    }
                }
                if (same)
                    System.out.println("The Files are same!");
                else
                    System.out.println("The files are not same!");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Invalid path. File not Found!");
        }
    }
}


