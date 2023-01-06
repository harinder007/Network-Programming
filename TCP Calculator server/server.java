import java.io.*; import java.net.*; public class server{
    public static void main(String [] args){ try{
    ServerSocket ss=new ServerSocket(6666); System.out.println("Waiting for connection	");
    Socket s=ss.accept(); System.out.println("connected");
    DataInputStream dis = new DataInputStream(s.getInputStream()); String str = (String)dis.readUTF();
    //int a=Integer.parseInt(str);
    
    double a = Double.parseDouble(str);
    
    
    
    DataInputStream dis1 = new DataInputStream(s.getInputStream()); String str1 = (String)dis.readUTF();
    //int b=Integer.parseInt(str1);
    
    double b = Double.parseDouble(str1);
    
    
    
    DataInputStream dis2 = new DataInputStream(s.getInputStream()); String str2 = (String)dis.readUTF();
    int op=Integer.parseInt(str2);
    
    
    
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
     
    double c; switch(op){ case 1:
    c=a+b; dout.writeUTF(c+""); break;
    
    
    case 2:
    
    c=a-b; dout.writeUTF(c+""); break;
    
    
    case 3:
    
    c=a*b; dout.writeUTF(c+""); break;
    
    
    case 4:
    
    c=a/b; dout.writeUTF(c+""); break;
    }
    
    ss.close();
    
    }catch(Exception e){ System.out.println(e);
    }
    
    }
     
    }
    