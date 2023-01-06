import java.io.*; 
import java.net.*;
 class server
{

public static void main(String args[]) throws Exception

{

DatagramSocket ss = new DatagramSocket(6666); byte[] receiveData = new byte[1024];


while(true)

{

DatagramPacket receivePacket =new DatagramPacket(receiveData, receiveData.length);



ss.receive(receivePacket);



String s =new String(receivePacket.getData());



System.out.println("" + s); ss.close();
}

}

}
