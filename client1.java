 //CLIENT SIDE PROGRAM

import java.io.*;
import java.net.*;

class client1 
{
	public static void main(String[] args) throws IOException 
    {
    	Socket s = null;
      	try 
        {
        	s = new Socket("127.0.0.1", 1234);
           	BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
           	String date = in.readLine();
	       	System.out.println("Date and time is:"+date);
           	s.close();
           	in.close();
         }
         catch (UnknownHostException e) 
         {
         	System.out.println("Error :"+e);
         } 
     }
} 