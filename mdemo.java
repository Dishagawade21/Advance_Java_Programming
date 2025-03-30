import java.awt.*;
import java.awt.event.*;
class mdemo extends Frame implements ActionListener
{
   MenuItem n,o;
   TextField t1;
   mdemo()
   {
      setTitle("MENUBAR APPLICATION");
      setSize(400,400);
      setVisible(true);
      MenuBar mbr= new  MenuBar();
      setMenuBar(mbr);
      Menu f=new Menu("File");
      Menu e=new Menu("Edit");
      Menu v=new Menu("View");
      t1=new TextField();
      n= new MenuItem("New");
      o= new MenuItem("open");
      f.add(n);
      f.add(o);
      mbr.add(f);
      mbr.add(e);
      mbr.add(v);
      add(t1);
      n.addActionListener(this);
      o.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae)
      {
        if(ae.getSource()==n)
          t1.setText("you have selected new option");
        if(ae.getSource()==o)
          t1.setText("you have selected open option");
      }
      public  static void main(String args[])
      {
        mdemo m=new mdemo();
      }
}

