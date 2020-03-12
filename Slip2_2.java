 /* Server_Slip2_2*/

import java.net.*;
import java.io.*;
import java.util.Date;

public class Server_Slip2_2
{
            public static void main(String g[])throws UnknownHostException, IOException
            {
                        ServerSocket ss=new ServerSocket(4444);
                        System.out.println("server started");
                        Socket s=ss.accept();
                        System.out.println("Client connected");
                        Date d=new Date();
                        int m=d.getMonth();
                        m=m+1;
                        int y=d.getYear();
                        y=y+1900;
                        String time=""+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()+" Date is "+d.getDate()+"/"+m+"/"+y;
                        OutputStream os=s.getOutputStream();
                        DataOutputStream dos=new DataOutputStream(os);
                        dos.writeUTF(time);
            }
}

/* client_Slip2_2*/

import java.net.*;
import java.io.*;
import java.util.*;
public class Client_2
{
       public static void main(String args[]) throws Exception
       {
              Socket s = new Socket("localhost",4444);
              DataInputStream dos = new DataInputStream(s.getInputStream());
                        String time = dos.readUTF();
                        System.out.println("Current date and time is "+time);
  }
}
