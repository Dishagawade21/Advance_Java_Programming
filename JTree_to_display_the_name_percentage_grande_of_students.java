import java.awt.*;
import javax.swing.*;

public class JTree_to_display_the_name_percentage_grande_of_students extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		Object Data [][]={
					 {"Disha","90","A"},
					 {"Rutuja","88","A"},
					 {"Samrudhhi","39","D"},
					 {"Sakshi","60","C"},
					 {"Purva","70","B"},
                        {"Srushti","95","A"},
					 {"Radha","85","A"},
					 {"Rani","79","c"},
					 {"Sakshi","80","B"},
					 {"Payal","70","B"}
					 };
		String colhead[]={"STUDNAME","PERCENTAGE","GRADE"};
		JTable t1=new JTable(Data,colhead);
		int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(t1,vsb,hsb);
		cp.add(jsp);
	}
}
/*<applet code="JTree_to_display_the_name_percentage_grande_of_students" width=400 height=400>
</applet>*/
                              

