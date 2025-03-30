
import java.net.*;

class URLDemo2
{
   public static void main(String args[])throws Exception
   {

        URL ul=new URL("http://http://www.msbte.org.in");
          	System.out.println("Protocol="+ul.getProtocol());
        	System.out.println("Host Name="+ul.getHost());
        	System.out.println("Port Number="+ul.getPort());
        	System.out.println("FileName="+ul.getFile());
	     
   }
}

