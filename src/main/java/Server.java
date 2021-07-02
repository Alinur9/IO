import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server extends Thread{
   private ServerSocket serverSocket;
   public Server(int port) throws IOException{
       serverSocket = new  ServerSocket(port);
       serverSocket.setSoTimeout(1000000);
   }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Waiting for Client on port: "+serverSocket.getLocalPort());
                serverSocket.getLocalPort();
                Socket server = serverSocket.accept();
                System.out.println("just connected to "+ server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thank you for connecting to "+server.getLocalSocketAddress() +" goodbye");
                server.close();
            }
            catch (SocketTimeoutException s){
                System.out.println("socket Timed out");
                break;
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
       int port = 6066;
       try {
           Thread t = new Server(port);
           t.start();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
