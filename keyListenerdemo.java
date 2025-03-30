import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class KeyListenerdemo1 extends Applet implements KeyListener
{
	String str=" ";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		setBackground(Color.cyan);
	}
	public void keyReleased(KeyEvent ke)
	{
		setBackground(Color.red );
	}
	public void keyTyped(KeyEvent ke)
	{
		str=" ";
		str=str+ke.getKeyChar();
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(str,50,50);
  	}
}
/*<applet code="KeyListenerdemo1" width=400 height=400>
</applet>*/