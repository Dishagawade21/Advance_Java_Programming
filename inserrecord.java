import java.sql.*;
class demo
{
	public static void main(string args[]);
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
		Statmenet st=con.createStatement();
		st.excuterUpdate("insert into stud values('disha','100');
		System.outy.ptintln("record inserted");
		ResultSet rs=st.excuteQuery("select* from stud");
		System.out.println("name \t rollno");
		while(rs.next())
		{
			System.out.println(getString("name")+"\t"+getInt("rollno"));
		}
con.close();
}
}		