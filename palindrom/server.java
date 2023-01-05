import java.net.*; 
import java.io.*; 
public class server{


public static void main(String [] args)throws IOException{ 
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();

DataInputStream dis = new DataInputStream(s.getInputStream()); 
String str = (String)dis.readUTF();
System.out.println("Message from Client: "+str); 
int a=Integer.parseInt(str);


int r,sum=0,temp; temp=a; while(a>0)
{ r=a%10;
sum=(sum*10)+r; a=a/10;
}

if(temp==sum){



DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
dout.writeUTF(" is palindrome number");
 
}

else

{

DataOutputStream dout = new DataOutputStream(s.getOutputStream()); dout.writeUTF(" is not palindrome number");
}

ss.close();

}

}
