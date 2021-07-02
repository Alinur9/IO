import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class totally {
    public static void main(String args[]) throws Exception{
        File file = new File("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\input.txt");
        File oab = new File("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\report.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(oab);
        byte[] byteArray = new byte[(int)file.length()];

        fis.read(byteArray);
        String data = new String(byteArray);

       // System.out.println("Number of characters in the String: "+data.length());
    }
}
