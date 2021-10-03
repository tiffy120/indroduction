import java.net.*; 
import java.io.*;
class Server
 {
  public static void main(String args[])throws Exception
  {
   String msg;
   ServerSocket ss=new ServerSocket(1095);
  Socket s=ss.accept();
  System.out.println(" is connected"+s.isConnected());
  System.out.println(" s="+s.getInetAddress());
  System.out.println(" port"+s.getPort());
  DataOutputStream dos =new DataOutputStream(s.getOutputStream());
  DataInputStream in=new DataInputStream(System.in);
  System.out.println(" Enter a message for client");
  while(true)
  { 
   String str=in.readLine();
   if ((str==null || str.equals("end")))
    {
     break;
    }
   else {
    dos.writeUTF(str);
     } 
  s.close();
 }
}