import java.awt.event.*;
import java.awt.*;
public class MouseHandling extends Frame implements MouseListener, MouseMotionListener
{
	MouseHandling()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ce)
			{
				System.exit(0);
			}
		});
	}
	public void mouseDragged(MouseEvent e)
	{
		setBackground(Color.gray);
		System.out.println("Mouse Dragged");
	}
	public void mouseMoved(MouseEvent e)
	{
		setBackground(Color.cyan);
		System.out.println("Mouse Moved");
	}
	public void mouseClicked(MouseEvent e)
	{
		setBackground(Color.green);
		System.out.println("Mouse Clicked");
	}
	public void mousePressed(MouseEvent e)
	{
		setBackground(Color.blue);
		System.out.println("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		setBackground(Color.black);
		System.out.println("Mouse Released");
	}
	public void mouseEntered(MouseEvent e)
	{
		setBackground(Color.red);
		System.out.println("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		setBackground(Color.orange);
		System.out.println("Mouse Exited");
	}
	public static void main(String[] args)
	{
		new MouseHandling();
	}
}