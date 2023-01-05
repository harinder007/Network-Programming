import java.net.*; 
import java.io.*; 
public class server{
    static boolean isArmstrong(int n)
    
    {
    
    int temp, digits=0, last=0, sum=0; temp=n;
    while(temp>0)
    
    {
    
    temp = temp/10; digits++;
    }
    
    temp = n; while(temp>0)
    {
    
    last = temp % 10;
    
    sum += (Math.pow(last, digits)); temp = temp/10;
    }
    
    if(n==sum) return true;
    else return false;
    
    }
     
    public static void main(String [] args)throws IOException{ 
        ServerSocket ss=new ServerSocket(6666);
    Socket s=ss.accept();
    
    DataInputStream dis = new DataInputStream(s.getInputStream()); 
    String str = (String)dis.readUTF();
    System.out.println("Message from Client: "+str); 
    int a=Integer.parseInt(str);
    if(isArmstrong(a))
    
    {
    
    DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
    dout.writeUTF(a+" is Armstrong");
    }
    
    else
    
    {
    
    DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
    dout.writeUTF(a+" is Not Armstrong");
    }
    
    ss.close();
    
    }
    
    }
    