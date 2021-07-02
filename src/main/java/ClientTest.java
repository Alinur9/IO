import java.io.*;
import java.net.Socket;

public class ClientTest {
    public static void main(String args[]){
        String serverName = "Server";
        int port = 6066;
        try {
            System.out.println("connecting to "+ serverName + ", port: "+port);
            Socket client = new Socket(serverName, port);
            System.out.println("connected to "+client.getRemoteSocketAddress());
            OutputStream outServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outServer);
            out.writeUTF("Hello from "+ client.getLocalSocketAddress());
            InputStream inServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inServer);
            System.out.println("server says: "+ in.readUTF());
            client.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
