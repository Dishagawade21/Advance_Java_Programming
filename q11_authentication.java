import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class trdemo extends JApplet implement TreeSelectionListener
{
	JTextField t1;
	JTree jt;
	DefaultMutableTreeNode o,b,c,co,it,ci,r,b1,g;
		
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new Flowlayout());
		o=new DefaultTreeNode("option");	

		b=new DefaultTreeNode("branch");	

		c=new DefaultTreeNode("color");	

		co=new DefaultTreeNode("co");	

		it=new DefaultTreeNode("it");	

		ci=new DefaultTreeNode("civil");	

		r=new DefaultTreeNode("red");	

		b1=new DefaultTreeNode("blue");	

		g=new DefaultTreeNode("green");
		b.add(co);
		b.add(it);
		b.add(ci);
		c.add(r);
		c.add(b1);
		c.add(g);
		o.add(b);
		o.add(c);
		jt=new JTree(o);
		t1=new JTextFieald();
		cp.add(jt);
		cp.add(t1);
	}
	public void valueChanged(TreeSelectionEvent te)
	{
		TreePath tp=te.getPath();
		Sting path=tp.toString();
		t1.setText(path);
	}

}
/*<applet code="trdemo" width=500 height="500">
</applet>*/


