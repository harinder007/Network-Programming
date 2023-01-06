import java.net.*;
 import java.io.*; 
 public class server{
    public static void main(String [] args)throws IOException { 
        ServerSocket ss=new ServerSocket(6666);
    Socket s=ss.accept(); ss.close();
    }
    
    }
    