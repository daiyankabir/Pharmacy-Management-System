package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeGUI extends JFrame
{
	private Container c;
	private ImageIcon icon;
	private JPanel panel1, panel2;
	public HomeGUI()
	{
		super("Home");
		this.setBounds(0,0,1600,900);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//icon
		icon = new ImageIcon("icon.png");
		this.setIconImage(icon.getImage());
		
		c = this.getContentPane();
		c.setLayout(null);
		
		//background
		icon = new ImageIcon("background.jpg");
		JLabel background = new JLabel("",icon,JLabel.CENTER);
		background.setBounds(0,0,1600,900);
		
		//panel1
		panel1 = new JPanel();
		panel1.setBounds(0,0,1600,900);
		panel1.add(background);
		
		//panel2
		panel2 = new JPanel();
		panel2.setBounds(50,150,940,400);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		
		//font
		Font f1 =new Font("Arial",Font.BOLD,50);
		Font f2 =new Font("Arial",Font.BOLD,20);
		
		//Label
		JLabel header= new JLabel("Home");
		header.setBounds(50,50,400,50);
		header.setFont(f1);
		header.setForeground(Color.white);
		
		JLabel label1 = new JLabel("Search Medicine");
		label1.setBounds(20,300,200,50);
		label1.setFont(f2);
		JLabel label2 = new JLabel("Manage Medicine");
		label2.setBounds(340,300,200,50);
		label2.setFont(f2);
		JLabel label3 = new JLabel("Transaction");
		label3.setBounds(660,300,200,50);
		label3.setFont(f2);
		
		//button
		JButton button1 = new JButton();
		icon = new ImageIcon("search.png");
		button1.setIcon(icon);
		button1.setBounds(20,50,250,250);
		
		JButton button2 = new JButton();
		icon = new ImageIcon("manage.png");
		button2.setIcon(icon);
		button2.setBounds(340,50,250,250);
		
		JButton button3 = new JButton();
		icon = new ImageIcon("transaction.png");
		button3.setIcon(icon);
		button3.setBounds(660,50,250,250);
		
		JButton button4 = new JButton();
		icon = new ImageIcon("logout.png");
		button4.setIcon(icon);
		button4.setBounds(1400,50,70,70);
		
		panel2.add(button1);
		panel2.add(label1);
		panel2.add(button2);
		panel2.add(label2);
		panel2.add(button3);
		panel2.add(label3);
		c.add(button4);
		c.add(panel2);
		c.add(header);
		c.add(panel1);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				SearchGUI s = new SearchGUI();
				s.setVisible(true);
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				ManageGUI m = new ManageGUI();
				m.setVisible(true);
			}
		});
		
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				TransactionGUI t = new TransactionGUI();
				t.setVisible(true);
			}
		});
		
		button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				LoginGUI t = new LoginGUI();
				t.setVisible(true);
			}
		});
	}
}