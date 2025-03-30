import java.awt.*;
import javax.swing.*;

public class JTree_to_display_the_name_OF_students extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		Object Data [][]={
					 {"Disha","1","CO"},
					 {"Rutuja","2","IT"},
					 {"Samrudhhi","3","CIVIL"},
					 {"Sakshi","4","CO"},
					 {"Purva","5","IT"}
                        
					 };
		String colhead[]={"STUDNAME","ROLLNO","BRANCH"};
		JTable t1=new JTable(Data,colhead);
		int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(t1,vsb,hsb);
		cp.add(jsp);
	}
}
/*<applet code="JTree_to_display_the_name_OF_students" width=400 height=400>
</applet>*/
                              

