import java.awt.*;

class q5_MENU extends Frame implements ActionListener
{
	MenuItem n,o;
	TextField t1;
	q5_MENU()
	{
	setTitle("frame");
	setSize(500,500);
	setVisible(true);
	
	t1=new TextField(10);

	MenuBar mbr = new MenuBar();
	setMenuBar(mbr);
	Menu f=new Menu("File");
	Menu e=new Menu("Edit");
	Menu v=new Menu("View");
	 n=new MenuItem("New");
	 o=new MenuItem("open");

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
	t1.setText("you selected new option");

	if(ae.getSource()==o)
	t1.setText("you selected open option");

}
	

public static void main (String args[])
{
	q5_MENU m=new q5_MENU();
}
}

