import java.net.*;
class q12_inetaddree 
{
	public static void main (String args[])throws Exception
	{
		InetAddress a1=InetAddress.getLocalHost();
		System.out.println("IP addes and host name of local machin="+a1);

		InetAddress a2=InetAddress.getByName("google.com");
		System.out.println("host name and ip address="+a2);

		InetAddress a3[]=InetAddress.getAllByName("yahoo.com");
		System.out.println(" address=");
		for(int i=0;i<a3.length;i++)
		{
			System.out.println(a3[i]);
		}

	}
} 	