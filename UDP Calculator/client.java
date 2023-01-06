import java.io.*; 
import java.net.*;
import java.util.Scanner;
 class client
{

public static void main(String args[]) throws Exception

{

DatagramSocket clientSocket = new DatagramSocket(); InetAddress IPAddress = InetAddress.getByName("localhost");


byte[] sendData = new byte[1024]; byte[] receiveData = new byte[1024];
Scanner myObj = new Scanner(System.in); int a,b;
System.out.println("enter no 1"); a = myObj.nextInt();
 
System.out.println("enter no 2"); b = myObj.nextInt();
int op; System.out.println("operator"); System.out.println(""); System.out.println("1:addition"); System.out.println("2:substraction"); System.out.println("3:multiplication"); System.out.println("4:division");
System.out.println("enter your selection	");

System.out.println(""); op = myObj.nextInt();




String s=Integer.toString(a); sendData = s.getBytes();
DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress, 6666); clientSocket.send(sendPacket);


String s1=Integer.toString(b); sendData = s1.getBytes();
DatagramPacket sendPacket1 = new DatagramPacket(sendData,sendData.length, IPAddress, 6666); clientSocket.send(sendPacket1);


String s2=Integer.toString(op); sendData = s2.getBytes();
DatagramPacket sendPacket2 = new DatagramPacket(sendData,sendData.length, IPAddress, 6666);
 
clientSocket.send(sendPacket2);



DatagramPacket receivePacket =new DatagramPacket(receiveData, receiveData.length);



clientSocket.receive(receivePacket);



String s3 =new String(receivePacket.getData());



System.out.println("" + s3);



clientSocket.close();

}

}
