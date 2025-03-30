import java.awt.*;

import java.sql.*;
import javax.swing.*;

import java.awt.event.*;

public class student extends Frame implements ActionListener

{
	
	Label l1,l2;
	
	TextField t1,t2;
	
	Button b1,b2,b3;
	
	Panel p1;
	student()
	
	{
	
		setLayout(null);		
		l1=new Label("Roll No.");
		
		l2=new Label("Name");
		
		t1=new TextField(10);
		
		t2=new TextField(10);
		
		b1=new Button("Add");
b2=new Button("Delete");
		b3=new Button("Display");

		p1=new Panel();	
		add(l1);
		
		add(t1);
		
		add(l2);
			
		add(t2);
		
		add(b1);
		add(b2);
		add(b3);

		add(p1);
		l1.setBounds(30,30,110,30);
		t1.setBounds(150,30,110,30);
		l2.setBounds(30,80,110,30);
		t2.setBounds(150,80,110,30);
		b1.setBounds(30,130,110,30);
		b2.setBounds(150,130,110,30);
		b3.setBounds(30,180,110,30);
		p1.setBounds(400,100,200,200);		
		b1.addActionListener(this);

		b2.addActionListener(this);

		b3.addActionListener(this);
	
	}
public void actionPerformed(ActionEvent ae)
	
	{
		
		int rn=Integer.parseInt(t1.getText());
		
		String n=t2.getText();
	
		if(ae.getSource()==b1)
		{	
			try
		
			{
			
				insert(rn,n);
		
			}
		
			catch(Exception e)
		
			{
		}

		}
		if(ae.getSource()==b2)
		{	
			try
		
			{
			
				delete(rn);
		
			}
catch(Exception e)
		
			{
		}


		}
		if(ae.getSource()==b3)
		{	
			try
		
			{
			
				display();
		
			}
		
			catch(Exception e)
		
			{
		}


		}
	}
	
	public void insert(int r,String n)throws Exception
	
	{
Connection con=DriverManager.getConnection("jdbc:odbc:sam");
		
		PreparedStatement ps=con.prepareStatement("insert into Student values(?,?)");
		
		ps.setInt(1,r);
		
		ps.setString(2,n);
		
		ps.executeUpdate();
		
		con.close();
	
	}
	
	public void delete(int r)throws Exception
	
	{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		Connection con=DriverManager.getConnection("jdbc:odbc:sam");
		
		PreparedStatement ps=con.prepareStatement("delete from Student where Rollno=?");
		
		ps.setInt(1,r);
		
		ps.executeUpdate();
		
		con.close();
	
}

	public void display()throws Exception
	
	{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		Connection con=DriverManager.getConnection("jdbc:odbc:sam");
		
		PreparedStatement ps=con.prepareStatement("select * from Student");
			
		ResultSet rs=ps.executeQuery();

		while(rs.next())
		{
				
		}		
		con.close();
	
	}
	
	public static void main(String args[])
	
	{
		
	
	}

}
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


