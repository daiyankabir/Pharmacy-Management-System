package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;

public class ManageGUI extends JFrame
{
	private Container c;
	private ImageIcon icon;
	private JPanel panel1, panel2;
	public ManageGUI()
	{
		super("Manage");
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
		panel2.setBounds(50,150,1100,320);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		
		//font
		Font f1 =new Font("Arial",Font.BOLD,45);
		Font f2 =new Font("Arial",Font.BOLD,20);
		
		//Label
		JLabel header= new JLabel("Manage Product");
		header.setBounds(100,50,600,50);
		header.setFont(f1);
		header.setForeground(Color.white);
		
		JLabel label1 = new JLabel("Add Medicine");
		label1.setBounds(30,200,160,50);
		label1.setFont(f2);
		JLabel label2 = new JLabel("Remove Medicine");
		label2.setBounds(190,200,170,50);
		label2.setFont(f2);
		JLabel label3 = new JLabel("Add Company");
		label3.setBounds(380,200,170,50);
		label3.setFont(f2);
		JLabel label4 = new JLabel("Remove Company");
		label4.setBounds(550,200,180,50);
		label4.setFont(f2);
		JLabel label5 = new JLabel("Add Inventory");
		label5.setBounds(750,200,170,50);
		label5.setFont(f2);
		JLabel label6 = new JLabel("Remove Inventory");
		label6.setBounds(910,200,180,50);
		label6.setFont(f2);
		
		//button
		JButton back = new JButton();
		icon = new ImageIcon("back.png");
		back.setIcon(icon);
		back.setBounds(50,50,50,50);
		
		JButton button1 = new JButton();
		icon = new ImageIcon("drug+.png");
		button1.setIcon(icon);
		button1.setBounds(20,50,150,150);
		
		JButton button2 = new JButton();
		icon = new ImageIcon("drug-.png");
		button2.setIcon(icon);
		button2.setBounds(200,50,150,150);
		
		JButton button3 = new JButton();
		icon = new ImageIcon("company+.png");
		button3.setIcon(icon);
		button3.setBounds(380,50,150,150);
		
		JButton button4 = new JButton();
		icon = new ImageIcon("company-.png");
		button4.setIcon(icon);
		button4.setBounds(560,50,150,150);
		
		JButton button5 = new JButton();
		icon = new ImageIcon("inventory+.png");
		button5.setIcon(icon);
		button5.setBounds(740,50,150,150);
		
		JButton button6 = new JButton();
		icon = new ImageIcon("inventory-.png");
		button6.setIcon(icon);
		button6.setBounds(920,50,150,150);
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				HomeGUI s = new HomeGUI();
				s.setVisible(true);
			}
		});
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				AddDrugGUI s = new AddDrugGUI();
				s.setVisible(true);
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				RemoveDrugGUI s = new RemoveDrugGUI();
				s.setVisible(true);
			}
		});
		
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				AddCompanyGUI s = new AddCompanyGUI();
				s.setVisible(true);
			}
		});
		
		button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				RemoveCompanyGUI s = new RemoveCompanyGUI();
				s.setVisible(true);
			}
		});
		
		button5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				AddInventoryGUI s = new AddInventoryGUI();
				s.setVisible(true);
			}
		});
		
		button6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				RemoveInventoryGUI s = new RemoveInventoryGUI();
				s.setVisible(true);
			}
		});
		
		c.add(button1);
		panel2.add(label1);
		panel2.add(label2);
		panel2.add(label3);
		panel2.add(label4);
		panel2.add(label5);
		panel2.add(label6);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		c.add(back);
		c.add(panel2);
		c.add(header);
		c.add(panel1);
		
		
	}
}