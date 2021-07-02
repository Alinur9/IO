import java.io.*;
public class CharReport {
    private static Object system;

    public static void main(String args[])throws IOException{
        FileReader in = null;
        FileWriter out = null;
        //system[] report = new char[50];
         class system{
            public char name;


            public system(char name ){
                this.name = name;
            }
        }
        system[]report;
        report = new system[50];


        String bal = new String();
        int k = bal.length();
        int i = 1;
        int h = 0;
        int e = 0;
        int l = 0;
        try {
            in = new FileReader("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\input.txt");
            out = new FileWriter("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\report.txt");

            int c;
            while ((c = in.read()) != -1){
                bal += c;

                }
            for (i = 1;i <= k; i++){
                char n1c = bal. charAt(k - i);
                system aba = new system(n1c);
                out.write(aba.name );


            }

        }
        finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }

        }

    }
}
