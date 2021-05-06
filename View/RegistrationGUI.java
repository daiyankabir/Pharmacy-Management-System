package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;
import Model.*;

public class RegistrationGUI extends JFrame
{
	private Container c;
	private ImageIcon icon;
	private JPanel panel1, panel2;
	public RegistrationGUI()
	{
		super("Registration");
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
		panel2.setBounds(550,200,500,350);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		
		//font
		Font f1 =new Font("Arial",Font.BOLD,30);
		Font f2 =new Font("Arial",Font.BOLD,20);
		
		//Label
		JLabel header= new JLabel("Registration Form");
		header.setBounds(680,20,800,200);
		header.setFont(f1);
		header.setForeground(Color.white);
		
		JLabel label1= new JLabel("User Name: ");
		label1.setBounds(10,0,150,50);
		label1.setFont(f2);
		JLabel label2= new JLabel("Password: ");
		label2.setBounds(10,50,150,50);
		label2.setFont(f2);
		JLabel label3= new JLabel("Email: ");
		label3.setBounds(10,100,150,50);
		label3.setFont(f2);
		JLabel label4= new JLabel("Contact No: ");
		label4.setBounds(10,150,150,50);
		label4.setFont(f2);
		JLabel label5= new JLabel("Address: ");
		label5.setBounds(10,200,150,50);
		label5.setFont(f2);
		
		//textfield
		JTextField tf1= new JTextField();
		tf1.setBounds(150,0,300,50);
		tf1.setFont(f2);
		JPasswordField tf2= new JPasswordField();
		tf2.setBounds(150,50,300,50);
		tf2.setFont(f2);
		JTextField tf3= new JTextField();
		tf3.setBounds(150,100,300,50);
		tf3.setFont(f2);
		JTextField tf4= new JTextField();
		tf4.setBounds(150,150,300,50);
		tf4.setFont(f2);
		JTextField tf5= new JTextField();
		tf5.setBounds(150,200,300,50);
		tf5.setFont(f2);
		
		//button
		JButton button1 = new JButton("Sign Up");
		button1.setBounds(200,270,120,50);
		
		panel2.add(label1);
		panel2.add(tf1);
		panel2.add(label2);
		panel2.add(tf2);
		panel2.add(label3);
		panel2.add(tf3);
		panel2.add(label4);
		panel2.add(tf4);
		panel2.add(label5);
		panel2.add(tf5);
		panel2.add(button1);
		c.add(panel2);
		c.add(header);
		c.add(panel1);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				LoginController loginController = new LoginController();
				if(tf1.getText().length()==0 || tf2.getText().length()==0 || tf3.getText().length()==0 || tf4.getText().length()==0 || tf5.getText().length()==0)
				{
					JOptionPane.showMessageDialog(null,"Please fill all forms");
				}
				else
				{
					User user = new User();
					user.setUserName(tf1.getText());
					user.setPassword(new String(tf2.getPassword()));
					user.setEmail(tf3.getText());
					user.setContactNo(tf4.getText());
					user.setAddress(tf5.getText());
					
					loginController.register(user);
					dispose();
					LoginGUI home = new LoginGUI();
					home.setVisible(true);
				}
			}
		});
	}
}