import java.io.*;

public class FileNew {
    public static void main(String args[])throws Exception {

        FileReader in = new FileReader("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\input.txt");
           FileWriter out = new FileWriter("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\output.txt");
         BufferedWriter pen = new BufferedWriter(out);
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
            pen.write("Saadman eije ami lekhtasi");
            pen.close();


            if (in != null)
                in.close();
            if (out != null)
                out.close();

        }

    }


