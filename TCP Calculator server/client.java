import java.util.Scanner; import java.io.*;
import java.net.*; public class client{
public static void main(String [] args){ try{
Socket s=new Socket("localhost",6666); Scanner myObj = new Scanner(System.in);


int a,c;

System.out.println("enter no 1"); a = myObj.nextInt();
DataOutputStream dout = new DataOutputStream(s.getOutputStream()); dout.writeUTF(a+"");
int b;
 
System.out.println("enter no 2"); b = myObj.nextInt();
DataOutputStream dout1 = new DataOutputStream(s.getOutputStream()); dout.writeUTF(b+"");
int op; System.out.println("operator"); System.out.println(""); System.out.println("1:addition"); System.out.println("2:substraction"); System.out.println("3:multiplication"); System.out.println("4:division");
System.out.println("enter your selection	");

System.out.println(""); op = myObj.nextInt();
DataOutputStream dout2 = new DataOutputStream(s.getOutputStream()); dout.writeUTF(op+"");


DataInputStream dis = new DataInputStream(s.getInputStream()); String str = (String)dis.readUTF();


System.out.println("RESULT: "+str);



dout.flush();

dout.close();

s.close();

}catch(Exception e){ System.out.println(e);
 
}

}

}
