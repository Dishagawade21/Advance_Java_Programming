import java.awt.*;
import javax.swing.*;

public class JTable_to_display_the_name_of_employee_output extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		Object Data [][]={
					 {"101","Amit","670000"},
					 {"102","jai","780000"},
					 {"101","Sachin","700000"},
					 };
		String colhead[]={"ID","NAME","SALARY"};
		JTable t1=new JTable(Data,colhead);
		int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(t1,vsb,hsb);
		cp.add(jsp);
	}
}
/*<applet code="JTable_to_display_the_name_of_employee_output" width=400 height=400>
</applet>*/
                              

