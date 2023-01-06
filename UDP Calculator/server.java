import java.io.*; import java.net.*; class server
{

public static void main(String args[]) throws Exception

{

DatagramSocket ss = new DatagramSocket(6666); byte[] receiveData = new byte[1024];
byte[] sendData = new byte[1024]; while(true)
{



DatagramPacket receivePacket =new DatagramPacket(receiveData, receiveData.length); ss.receive(receivePacket);
String s1 =new String(receivePacket.getData()); Double a = Double.parseDouble(s1);


DatagramPacket receivePacket1 =new DatagramPacket(receiveData, receiveData.length); ss.receive(receivePacket1);
String s2 =new String(receivePacket1.getData()); Double b = Double.parseDouble(s2);


DatagramPacket receivePacket2 =new DatagramPacket(receiveData, receiveData.length); ss.receive(receivePacket2);
 
String op1 =new String(receivePacket2.getData()); Double op = Double.parseDouble(op1);


InetAddress IPAddress = receivePacket.getAddress(); int port = receivePacket.getPort();
DatagramPacket sendPacket;



System.out.println(a+"\n"+b+"\n"+op);



String s; Double c; if(op == 10.0){
c=a+b; System.out.println("RESULT: "+c); s=Double.toString(c);
sendData = s.getBytes();

sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress,port); ss.send(sendPacket);
}

else if(op == 20.0) { c=a-b;
System.out.println("RESULT: "+c); s=Double.toString(c);
sendData = s.getBytes();

sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress,port); ss.send(sendPacket);
}
 
else if(op == 30.0) { c=a*b;
System.out.println("RESULT: "+c); s=Double.toString(c);
sendData = s.getBytes();

sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress,port); ss.send(sendPacket);
} else if(op == 40.0) { c=a/b;
System.out.println("RESULT: "+c); s=Double.toString(c);
sendData = s.getBytes();

sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress,port); ss.send(sendPacket);
}

else{

String err="select from 1-4"; sendData = err.getBytes();
sendPacket = new DatagramPacket(sendData,sendData.length, IPAddress,port); ss.send(sendPacket);
}

//ss.close();

}

}

}
