
import java.net.*;
import java.io.*;
class URLconnection
{
   public static void main(String args[])throws Exception
   {

        URL ul=new URL("http://www.google.com/index.html");
          	URLConnection con= ul.openConnection();
		InputStream in=con.getInputStream();
 		int ch;
		while((ch=in.read())!=-1)
		{
		System.out.print((char)ch);
		}
   }
}

