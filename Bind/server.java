import java.io.*; 
import java.net.*; 
public class server {
    public static void main(String[] args) throws IOException { InetAddress inetAddress=InetAddress.getByName("localhost"); int port=6666;
    ServerSocket ss = new ServerSocket(); System.out.println("waiting for bind	");
    SocketAddress endPoint=new InetSocketAddress(inetAddress, port); ss.bind(endPoint);
    Socket s=ss.accept(); System.out.println("connected");
    }
    
    }
    