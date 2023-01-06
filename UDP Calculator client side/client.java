import java.io.*; 
import java.net.*;
import java.util.Scanner; 
class client
{

public static void main(String args[]) throws Exception

{

DatagramSocket clientSocket = new DatagramSocket(); InetAddress IPAddress = InetAddress.getByName("localhost");


byte[] sendData = new byte[1024]; Scanner myObj = new Scanner(System.in); int a,b;
System.out.println("enter no 1"); a = myObj.nextInt();
int c;

System.out.println("enter no 2");
 
b = myObj.nextInt(); int op;
System.out.println("operator"); System.out.println(""); System.out.println("1:addition"); System.out.println("2:substraction"); System.out.println("3:multiplication"); System.out.println("4:division"); System.out.println("enter your selection	");
System.out.println(""); op = myObj.nextInt();
DatagramPacket sendPacket; String s;
switch(op){ case 1:
c=a+b; System.out.println("RESULT: "+c); s=Integer.toString(c);
sendData = s.getBytes();

sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress, 6666); clientSocket.send(sendPacket);
break;



case 2:

c=a-b; System.out.println("RESULT: "+c); s=Integer.toString(c);
 
sendData = s.getBytes();

sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress, 6666); clientSocket.send(sendPacket);
break;



case 3:

c=a*b; System.out.println("RESULT: "+c); s=Integer.toString(c);
sendData = s.getBytes();

sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress, 6666); clientSocket.send(sendPacket);
break;



case 4:

c=a/b; System.out.println("RESULT: "+c); s=Integer.toString(c);
sendData = s.getBytes();

sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress, 6666); clientSocket.send(sendPacket);
break;



}

clientSocket.close();

}

}
