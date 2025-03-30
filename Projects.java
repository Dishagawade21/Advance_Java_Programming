import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

class Projects extends JFrame implements ActionListener
{		
	    
		 
            	JTextField t1,t2,t3;
            	JButton b1,b2,b3;
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		 
		Statement st;
		Connection con;
		JTable jt;
		String[] columnNames = {"Roll No", "Name", "Branch"};
		DefaultTableModel model = new DefaultTableModel();

            Projects()
            {
		setSize(900,600);
		setVisible(true);
		setTitle("Student Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       	setLayout(new GridLayout(1,3,40,40));
	  	
	 	GridLayout g=new GridLayout(7,2);
                  p1.setLayout(g);

		JLabel l1=new JLabel("Rollno:");
		JLabel l2=new JLabel("Name:");
		JLabel l3=new JLabel("Branch:");
	
 		t1=new JTextField();
 		t2=new JTextField();
 		t3=new JTextField();
 	 
		b1=new JButton("Insert");
		b2=new JButton("Show");
		b3=new JButton("Clear");

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(b1);
		p1.add(b2);	
		p1.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this); 
		b3.addActionListener(this); 


		
		
	
		jt = new JTable();
	JScrollPane scroll = new JScrollPane(jt);
		scroll.setHorizontalScrollBarPolicy(
	JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	scroll.setVerticalScrollBarPolicy(
	JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
	
		p2.add(scroll);
		add(p1);
		 
		add(p2);
            }

public void getcon() throws Exception
{
	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	  con=DriverManager.getConnection("jdbc:odbc:sample");
          st=con.createStatement();
}
public void actionPerformed(ActionEvent ae)
{
 	 
 
	if(ae.getSource()==b1)
	{
	try{
	int rn=Integer.parseInt(t1.getText());
	String n=t2.getText();
	String b=t3.getText();	
	getcon();
        st.executeUpdate("insert into student values("+rn+",'"+n+"','"+b+"')");
	JOptionPane.showMessageDialog	(null,"Record Inserted Successfully");
	con.close();  
	}catch(Exception e){}
	}
		

	if(ae.getSource()==b2)
	{
		model.setRowCount(0);
		model.setColumnIdentifiers(columnNames);
	 	
		
		jt.setModel(model); 
		//jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		//jt.setFillsViewportHeight(true);
		ResultSet rs;
		try{
	 	getcon();
		  rs = st.executeQuery("select * from student");
 
		while(rs.next())
		{
			int roll = rs.getInt("Rollno");
			String name = rs.getString("Name");
			String br = rs.getString("Branch");			 
			model.addRow(new Object[]{roll, name, br});
 
		}
		con.close();
 	
	}catch(Exception e){}
	
	  
	}

	if(ae.getSource()==b3)
	{
		 
	 	t1.setText("");
		t2.setText("");
		t3.setText("");
	
	}
}
public static void main(String args[]) throws Exception
{
	Projects p1 = new Projects();
}
}
 
 