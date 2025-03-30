import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class mousedemo extends Applet implements MouseListener,MouseMotionListener
{
	int x,y;
 	String msg="";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
 		
		msg="Mouse pressed";
		setBackground(Color.pink);	
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		
		x=me.getX();
		y=me.getY();
 		
		msg="Mouse Released";
		setBackground(Color.blue);
		repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		
		x=me.getX();
		y=me.getY();
 		
		msg="Mouse Clicked";
		setBackground(Color.red);
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		
		x=me.getX();
		y=me.getY();
 		
		msg="Mouse Entered";
		setBackground(Color.green);
		repaint();
	}

	public void mouseExited(MouseEvent me)
	{
		
		x=me.getX();
		y=me.getY();
 		
		msg="Mouse Exited";
		setBackground(Color.yellow);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		
		x=me.getX();
		y=me.getY();
 		
		msg="Mouse Moved at location="+x+":"+y;
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		
		x=me.getX();
		y=me.getY();
 		
		msg="Mouse Dragged at location="+x+":"+y;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
		showStatus(msg);
	}
}
/*<applet code="mousedemo" width=400 height=400>
</applet>*/


