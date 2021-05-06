package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;
import Model.*;

public class LoginGUI extends JFrame
{
	private Container c;
	private ImageIcon icon;
	private JPanel panel1,panel2;
	public LoginGUI()
	{
		super("Login");
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
		panel2.setBounds(550,300,400,200);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		
		//font
		Font f1 =new Font("Arial",Font.BOLD,50);
		Font f2 =new Font("Arial",Font.BOLD,20);
		
		//Label
		JLabel header= new JLabel("Pharmacy Management System");
		header.setBounds(400,0,800,200);
		header.setFont(f1);
		header.setForeground(Color.white);
		JLabel label1= new JLabel("Username: ");
		label1.setBounds(20,0,150,50);
		label1.setFont(f2);
		JLabel label2= new JLabel("Password: ");
		label2.setBounds(20,50,150,50);
		label2.setFont(f2);
		
		//textfield
		JTextField tf1= new JTextField();
		tf1.setBounds(150,0,200,50);
		tf1.setFont(f2);
		JPasswordField tf2= new JPasswordField();
		tf2.setBounds(150,50,200,50);
		tf2.setFont(f2);
		
		//button
		JButton button1 = new JButton("Login");
		button1.setBounds(50,120,120,50);
		JButton button2 = new JButton("Sign Up");
		button2.setBounds(200,120,120,50);
		
		panel2.add(label1);
		panel2.add(tf1);
		panel2.add(label2);
		panel2.add(tf2);
		panel2.add(button1);
		panel2.add(button2);
		c.add(panel2);
		c.add(header);
		c.add(panel1);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				LoginController loginController = new LoginController();
				if(tf1.getText().length()==0 || tf2.getText().length()==0)
				{
					JOptionPane.showMessageDialog(null,"Please fill all forms");
				}
				else
				{
					User user = new User(tf1.getText(), new String(tf2.getText()));
					if(loginController.validity(user)==1)
					{
					dispose();
					HomeGUI home = new HomeGUI();
					home.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid Username or password");
					}
				}
			}
		});
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				RegistrationGUI reg = new RegistrationGUI();
				reg.setVisible(true);
			}
		});
	}
}