import java.awt.*;
import java.awt.event.*;
class count_of_mause_click extends Frame implements MouseListener
{    
	
	
	count_of_mause_click()
	{ 
		
	  	addMouseListener(this);
 	  	setSize(400,400);
		setTitle("MOUSE FRAME");
		setVisible(true);
 		
	}
	public void mousePressed(MouseEvent me)
	{
	
		
	     
		
	}
	public void mouseReleased(MouseEvent me)
	{
		
		
	}
	public void mouseClicked(MouseEvent me)
	{
	System.out.println("Number of Clicks "+me.getClickCount());
 
	
	}
	public void mouseEntered(MouseEvent me)
	{
		
		
	}
	public void mouseExited(MouseEvent me)
	{
		
		
	}
public static void main(String args[])
{
    count_of_mause_click c= new count_of_mause_click();	
}
}

