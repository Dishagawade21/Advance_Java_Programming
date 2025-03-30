import java.net.*;
class inetAdressdemo
{
  public static void main (String args[]) throws Exception
  {
// Instance methods 
	InetAddress a1=InetAddress.getByName("google.com");
	InetAddress a2=InetAddress.getByName("facebook.com");
	 System.out.println("IP Address of Host : "+a1.getHostAddress());  
	System.out.println("Host Name : "+a1.getHostName()); 

	/*System.out.println("IP Addtess : "+a1.getAddress()); 
	System.out.println("Muttipale addresses present or not : "+a1.isMulticastAddress()); 

      System.out.println("Two host are same or not="+a1.equals(a2)); 



	System.out.println("IP address of local machin="+a1);
	InetAddress a2=InetAddress.getByName("google.com");
	System.out.println("IP Address= "+a2);
     
	InetAddress a4=InetAddress.getHostAddress("google.com");
	System.out.println("IP Address= "+a4);




      InetAddress a3[]=InetAddress.getAllByName("google.com");
	System.out.println("IP Address= ");
	for(int i=0;i<a3.length;i++)
	{
		System.out.println(a3[i]);
	}*/
     
}

}



/*Exerscise :Develop a program using InetAddress class to retrieve IP address of computer when hostname is entered by the user.

import java.net.*;
import java.io.*;

class IDemo
{
      public static void main(String args[]) throws Exception
      {
	DataInputStream din=new DataInputStream(System.in);
	System.out.print("Enter the Host name :");
	String host=din.readLine();

	InetAddress a1=InetAddress.getByName(host);
	System.out.println("IP Address of Host : "+a1.getHostAddress());  
	System.out.println("Host Name : "+a1.getHostName()); 
       }

}*/
