import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;

public class DirectoryCompare{
    private String path1;
    private String path2;
    public DirectoryCompare(String path){
        Scanner a1 = new Scanner(System.in);
        System.out.println("Please provide file path:-");
        path1 = a1.nextLine();
        this.path1 = path1;
        System.out.println("Please provide file path:-");
        path2 = a1.nextLine();
        this.path2 = path2;
    }

    public void directoryCompare(File x)throws IOException{
        File a1 = new File(path1);
        File a2 = new File(path2);
        boolean test1 = a1.isDirectory();
        boolean test2 = a2.isDirectory();
        File[] children1 = null;
        File[] children2 = null;

        if (test1){
            children1 = a1.listFiles();
        }
        if (test2){
            children2 = a2.listFiles();
        }
        for (File child1 : children1){
            if (child1.isDirectory()){
                directoryCompare(child1);
            }
            else{
                System.out.println(child1.getName());
            }
        }
    }
}
