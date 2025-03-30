import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Keymessage extends Applet implements KeyListener
{	 
	 
	public void init()
	{ 
  
		addKeyListener(this);
	}
public void keyPressed(KeyEvent ke)
{
	 
	showStatus("Key Pressed");
}
public void keyReleased(KeyEvent ke)
{
 	showStatus("Key Released");
}
public void keyTyped(KeyEvent ke)
{
	showStatus("Key Typed");		   
}
}
/*<Applet code="Keymessage"width="300"height="300">
</Applet>*/
