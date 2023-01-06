import java.net.*; 
import java.io.*; 
import java.util.Date;


public class server {

public static void main(String[] args)throws IOException { 
    ServerSocket ss= new ServerSocket(5000); 
    System.out.println("Waiting For Connection ..."); 
    Socket cs=ss.accept();


Date d=new Date();

String s="Current Date & Time on Server is:"+d;

PrintWriter toclient=new PrintWriter(cs.getOutputStream(),true); 
toclient.print(s);
toclient.close(); cs.close();
ss.close();

}

}
