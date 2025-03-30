import java.net.*;
import java.io.*;
class udemo
{
   public static void main(String args[])throws Exception
   {

        URL ul=new URL("http://localhost:8080/urlconnection/index.html");
          	URLConnection con= ul.openConnection();
		//InputStream in=con.getInputStream();
 		System.out.println("lenght="+in.getContentLenght());

   }
}

