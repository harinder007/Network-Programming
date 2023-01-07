import java.net.*; 
import java.io.*; 
import java.util.*; 
public class client{
    public static void main(String [] args)throws IOException { Socket s=new Socket("localhost",6666);
     
    Scanner sc=new Scanner(System.in); System.out.print("Enter no: ");
    int a=sc.nextInt();
    
    DataOutputStream dout = new DataOutputStream(s.getOutputStream()); dout.writeUTF(a+"");
    System.out.println("Fibonacci Series of "+a); int n1=0,n2=1,n3,i; System.out.println(n1+""); System.out.println(n2+"");
    
    
    for(i=2;i<a;++i)
    
    {
    
    n3=n1+n2; System.out.println(""+n3); n1=n2;
    n2=n3;
    
    }
    
    
    
    }
    
    }
    