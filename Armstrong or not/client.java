import java.net.*; 
import java.io.*; 
import java.util.*; 
public class client{
public static void main(String [] args)throws IOException { 
Socket s=new Socket("localhost",6666);
Scanner sc=new Scanner(System.in); int a=sc.nextInt();
DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
dout.writeUTF(a+"");
DataInputStream dis = new DataInputStream(s.getInputStream()); 
String str = (String)dis.readUTF();
System.out.println("Message from Server: "+str);

}

}
