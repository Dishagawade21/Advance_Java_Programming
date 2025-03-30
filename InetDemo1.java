import java.net.*;
import java.io.*;

class InetDemo1
{
        public static void main(String args[]) throws Exception
        {
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter hostname:");
		String s=br.readLine();
	
		InetAddress a2=InetAddress.getByName(s);
		System.out.println("\nIP Address = "+a2);


		

	 
        }

}