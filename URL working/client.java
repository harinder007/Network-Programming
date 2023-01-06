import java.net.*; 
import java.io.*;
 
public class client{

public static void main(String [] args)throws IOException { 
    Socket s=new Socket("localhost",6666);
URL url=new URL("https://www.google.co.in/"); 
System.out.println("Protocol: "+url.getProtocol()); 
System.out.println("Host Name: "+url.getHost()); 
System.out.println("Port Number: "+url.getPort()); 
s.close();
}

}
