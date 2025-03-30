import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Keyspecial extends Applet implements KeyListener
{	 
	 
	public void init()
	{ 
  
		addKeyListener(this);
	}
public void keyPressed(KeyEvent ke)
{
	 
	int code=ke.getKeyCode();
	String s=ke.getKeyText(code);
	showStatus(s);
}
public void keyReleased(KeyEvent ke)
{
 	
}
public void keyTyped(KeyEvent ke)
{
	showStatus("Key Typed");		   
}
}
/*<Applet code="Keyspecial"width="300"height="300">
</Applet>*/
