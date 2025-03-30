import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
public class treedemo extends JApplet implements TreeSelectionListener
{
  JTree jt;
  JTextField t1;
  DefaultMutableTreeNode o,b,c,co,it,ci,r,g,b1;
  
  public void init()
  {
    Container cp=getContentPane();
    cp.setLayout(new FlowLayout());
    
    o= new DefaultMutableTreeNode("Opetion");
    b= new DefaultMutableTreeNode("Branch");
    c= new DefaultMutableTreeNode("color");
    co= new DefaultMutableTreeNode("co");
    it= new DefaultMutableTreeNode("it");
    ci= new DefaultMutableTreeNode("civil");
    r= new DefaultMutableTreeNode("red");
    g= new DefaultMutableTreeNode("grren");
    b1= new DefaultMutableTreeNode("blue");
    b.add(co);
    b.add(it);
    b.add(ci);
    c.add(r);
    c.add(g);
    c.add(b1);
    o.add(b);
    o.add(c);
    jt=new JTree(o);
    t1=new JTextField();
    cp.add(jt);
    cp.add(t1);
    jt.addTreeSelectionListener(this);
}
public void valueChanged(TreeSelectionEvent te)
{
   TreePath tp= te.getPath();
   String path =tp.toString();
   t1.setText(path);
}
}
/*<applet code="treedemo" width=400 height=400>
</applet>*/ 




