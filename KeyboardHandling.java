import java.awt.*;
import java.awt.event.*;
public class KeyboardHandling extends Frame implements KeyListener
{
	Label label;
	TextArea textarea;
	KeyboardHandling()
	{
		label = new Label();
		label.setBounds(20,40,100,20);
		textarea = new TextArea();
		textarea.setBounds(20,70,460,310);
		textarea.addKeyListener(this);
		add(label);
		add(textarea);
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ce)
			{
				System.exit(0);
			}
		});
	}
	public void keyTyped(KeyEvent e)
	{
		label.setText("Key Typed");
	}
	public void keyPressed(KeyEvent e)
	{
		label.setText("Key Presed");
	}
	public void keyReleased(KeyEvent e) {
		label.setText("Key Released");
	}
	public static void main(String[] args) {
		new KeyboardHandling();
	}
}