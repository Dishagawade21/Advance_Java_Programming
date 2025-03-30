import java.sql.*;
class sql_qurye 
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc.odbc.data1");
		Statement st=con.createStatement();
		st.execute("Create table student(rollno int, name varchar(20))");
		System.out.println("Table sreated");
		con.close();
	}
}
/*

insert record
import java.sql.*;
class sql_qurye 
{
	public static void main(String args[])
	{
		class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc.odbc.data");
		Statement st=con.createStatement();
		st.executeUpdate("Inster into student values(1,'disha')");
		System.out.println("Insert record");
		con.close();
	}
}

insert record
import java.sql.*;
class sql_qurye 
{
	public static void main(String args[])
	{
		class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc.odbc.data");
		Statement st=con.createStatement();
		st.executeUpdate("delete from student where rollno=1");
		System.out.println("Delete record");
		con.close();
	}
}


insert record
import java.sql.*;
class sql_qurye 
{
	public static void main(String args[])
	{
		class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc.odbc.data");
		Statement st=con.createStatement();
		st.executeUpdate("Update student set name='disha' where rollno=1");
		System.out.println("Update record");
		con.close();
	}
}
*/