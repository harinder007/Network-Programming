import java.net.*; 
import java.io.*; 
import java.util.*; 
public class server{
public static void main(String [] args)throws IOException{ 
    ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();

DataInputStream dis = new DataInputStream(s.getInputStream()); 
String str = (String)dis.readUTF();
System.out.println("Message from Client: "+str); 
String str1=str.toUpperCase();
DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
dout.writeUTF(str1);
ss.close();

}

}
