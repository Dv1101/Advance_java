import javax.swing.*;
import java.awt.FlowLayout;
class Buttons extends JFrame
{
	static JButton b;
	Buttons()
	{
		this.setSize(600,500);
		this.setTitle("Dhruvfirstswing");
		this.setLayout(new FlowLayout());
		b=new JButton("Click ME");
		this.add(b);
		this.setVisible(true);
	}
	public static void main(String[]args)
	{
		new Buttons();
	}
}