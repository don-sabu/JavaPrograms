import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener
{
	JFrame f;
	JTextField t;
	String s0,s1,s2;
	Calculator()
	{
		s0=s1=s2="";
		f = new JFrame("Calculator");
		t = new JTextField(10);
		t.setEditable(false);
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bp = new JButton(".");
		JButton ba = new JButton("+");
		JButton bs = new JButton("-");
		JButton bm = new JButton("x");
		JButton bd = new JButton("/");
		JButton be = new JButton("=");
		JButton bc = new JButton("C");
		 t.setBounds(20,20,290,40);
		b0.setBounds(20,250,110,50);
		b1.setBounds(20,190,50,50);
		b2.setBounds(80,190,50,50);
		b3.setBounds(140,190,50,50);
		b4.setBounds(20,130,50,50);
		b5.setBounds(80,130,50,50);
		b6.setBounds(140,130,50,50);
		b7.setBounds(20,70,50,50);
		b8.setBounds(80,70,50,50);
		b9.setBounds(140,70,50,50);
		bp.setBounds(140,250,50,50);
		ba.setBounds(200,250,50,50);
		bs.setBounds(200,190,50,50);
		bm.setBounds(200,130,50,50);
		bd.setBounds(260,130,50,50);
		be.setBounds(260,190,50,110);
		bc.setBounds(200,70,110,50);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bp.addActionListener(this);
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		be.addActionListener(this);
		bc.addActionListener(this);
		f.add(t);
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bp);
		f.add(ba);
		f.add(bs);
		f.add(bm);
		f.add(bd);
		f.add(be);
		f.add(bc);
		f.setLayout(null);
		f.setBackground(Color.black);
		f.setSize(345,360);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if ((s.charAt(0)>='0')&&(s.charAt(0)<='9'))
		{
			if (!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;
			t.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == 'C')
		{
			s0 = s1 = s2 = "";
			t.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == '=')
		{
			double te;
			if (s1.equals("+"))
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			else if (s1.equals("-"))
				te = (Double.parseDouble(s0) - Double.parseDouble(s2));
			else if (s1.equals("/"))
				te = (Double.parseDouble(s0) / Double.parseDouble(s2));
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2));
			t.setText(s0 + s1 + s2 + "=" + te);
			s0 = Double.toString(te);
			s1 = s2 = "";
		}
		else
		{
			if (s1.equals("") || s2.equals(""))
				s1 = s;
			else
			{
				double te;
				if (s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));
				s0 = Double.toString(te);
				s1 = s;
				s2 = "";
			}
			t.setText(s0 + s1 + s2);
		}
	}
	public static void main(String[] args)
	{
		new Calculator();
	}
}
