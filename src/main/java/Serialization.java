import java.io.*;

public class Serialization {
    public static void serialize(Object d) throws IOException{
        try {
            FileOutputStream out = new FileOutputStream("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\Serialized.txt");
            ObjectOutputStream serial = new ObjectOutputStream(out);
            serial.writeObject(d);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws IOException {
        Dog d = null;
        try {
            FileInputStream in = new FileInputStream("C:\\Users\\Adnan\\IdeaProjects\\IO\\src\\Serialized.txt");
            ObjectInputStream deSerial = new ObjectInputStream(in);
            d = (Dog) deSerial.readObject();
            in.close();
            deSerial.close();
        }
        catch (ClassNotFoundException c){
            c.printStackTrace();
        }
        catch (FileNotFoundException f){
            f.printStackTrace();
        }
        System.out.println("Name : "+ d.getDogName());
        System.out.println("Age  : "+ d.getAge());

    }
}