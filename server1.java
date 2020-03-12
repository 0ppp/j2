import java.net.*;
import java.io.*;
import java.util.*;

class server1
  {
    public static void main(String[] args) throws IOException 
     {
       Socket s = null;
       PrintWriter out = null;
       ServerSocket ss = null;
       try 
        {
          ss = new ServerSocket(1234);
          System.out.println("Server Started.......");
          s= ss.accept();
          System.out.println("Server Connected.......");
          out = new PrintWriter(s.getOutputStream(), true);
          Date d=new Date();
          out.println(d);
          out.close();
          s.close();
        } 
      catch (Exception e) 
        {
          System.out.println("Error:"+e);
        }
    } 
 }
 
