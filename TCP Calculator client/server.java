import java.io.*; 
import java.net.*; 
public class server{
    public static void main(String [] args){ try{
    ServerSocket ss=new ServerSocket(6666); System.out.println("Waiting for connection	");
    Socket s=ss.accept(); System.out.println("connected");
    DataInputStream dis = new DataInputStream(s.getInputStream()); String str = (String)dis.readUTF();
    System.out.println("RESULT: "+str); 
    ss.close();
    }catch(Exception e){ System.out.println(e);
    }
    
    }
    
    }
    