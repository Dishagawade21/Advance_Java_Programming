//Demonstration of URL
import java.net.*;

class UrlDemo
{
   public static void main(String args[])throws Exception
   {

        URL uh=new URL("http://www.yahoo.com/index.html?select * from student#MYDATA");
          	System.out.println("Protocol =  "+uh.getProtocol());
        	System.out.println("Host Name =  "+uh.getHost());
        	System.out.println("Port No =  "+uh.getPort());
        	System.out.println("FileName=  "+uh.getFile());
	     System.out.println("Reference=  "+uh.getRef());
	     System.out.println("Query =  "+uh.getQuery());
        	System.out.println("Full URL =  "+uh.toExternalForm());
   }
}

