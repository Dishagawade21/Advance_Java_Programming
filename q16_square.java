import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class q16_square extends Applet implements ActionListener
{
	Button b1;
	TextField t1,t2;

	public void init()
	{
		GridLayout g=new GridLayout(2,2);
		setLayout(g);
		Label l1=new Label("Enter number");
		t1=new TextField();
		t2=new TextField();
		b1=new Button("square");
		add(l1);
		add(t1);
		add(b1);
		add(t2);
		b1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== b1)
		{
			int a =Integer.parseInt(t1.getText());
			t2.setText("square="+a*a);
		}



	}
}
/*<applet code="q16_square" width=500 height=500>
</applet>*/