import java.net.*;
import java.io.*;
class uconnection
{
   public static void main(String args[])throws Exception
   {

        URL ul=new URL("http://localhost:8080/urlconnection/index.html");
          	URLConnection con= ul.openConnection();
		InputStream in=con.getInputStream();
 		int ch;
		while((ch=in.read())!=-1)
		{
		System.out.print((char)ch);
		}
   }
}

