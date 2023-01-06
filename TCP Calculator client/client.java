import java.util.Scanner; 
import java.io.*;
import java.net.*; 
public class client{
public static void main(String [] args){ try{
Socket s=new Socket("localhost",6666); Scanner myObj = new Scanner(System.in);


int a,b; System.out.println("enter no 1"); a = myObj.nextInt();
int c;

System.out.println("enter no 2"); b = myObj.nextInt();
int op; System.out.println("operator"); System.out.println("");
 
System.out.println("1:addition"); System.out.println("2:substraction"); System.out.println("3:multiplication"); System.out.println("4:division"); System.out.println("enter your selection	");
System.out.println(""); op = myObj.nextInt();
DataOutputStream dout = new DataOutputStream(s.getOutputStream());



switch(op){ case 1:
c=a+b; dout.writeUTF(c+"");
System.out.println("RESULT: "+c); break;
case 2:

c=a-b; dout.writeUTF(c+"");
System.out.println("RESULT: "+c); break;
case 3:

c=a*b; dout.writeUTF(c+"");
System.out.println("RESULT: "+c); break;
case 4: c=a/b;
 
dout.writeUTF(c+""); System.out.println("RESULT: "+c); break;
}

dout.flush();

dout.close();

s.close();

}catch(Exception e){ System.out.println(e);
}

}

}
