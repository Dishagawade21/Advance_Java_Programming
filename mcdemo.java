import java.awt.*;
import java.awt.event.*;
class mcdemo extends Frame 
{
   MenuItem r,p,o,y,b;
   mcdemo()
   {
      setTitle("COLOR MENUBAR APPLICATION");
      setSize(400,400);
      setVisible(true);
      MenuBar mbr= new  MenuBar();
      setMenuBar(mbr);
      Menu c=new Menu("COLOR");
      r= new MenuItem("Red");
      b= new MenuItem("Black");
      p= new MenuItem("Pink");
      o= new MenuItem("Orange");
      y= new MenuItem("Yellow");
      c.add(r);
      c.add(b);
      c.add(p);
      c.add(o);
      c.add(y);
      b.setEnabled(false);
      mbr.add(c);
     }
      public  static void main(String args[])
      {
        mcdemo m=new mcdemo();
      }
}

