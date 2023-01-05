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
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();

DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
dout.writeUTF(a);
ss.close();

}

}
