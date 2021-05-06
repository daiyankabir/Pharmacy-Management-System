package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;
import Model.*;

public class TransactionGUI extends JFrame
{
	private Container c;
	private ImageIcon icon;
	private JPanel panel1, panel2;
	private JTable table;
	public TransactionGUI()
	{
		super("Transaction");
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
		
		/*Logo
		icon = new ImageIcon("logo.jpg");
		JLabel logo = new JLabel("",icon,JLabel.CENTER);
		logo.setBounds(1300,20,200,200);*/
		
		//panel1
		panel1 = new JPanel();
		panel1.setBounds(0,0,1600,900);
		panel1.add(background);
		
		//panel2
		panel2 = new JPanel();
		panel2.setBounds(100,350,940,400);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		
		//font
		Font f1 =new Font("Arial",Font.BOLD,45);
		Font f2 =new Font("Arial",Font.BOLD,17);
		
		//Label
		JLabel header= new JLabel("Relax Drug Store");
		header.setBounds(100,50,600,50);
		header.setFont(f1);
		header.setForeground(Color.white);
		JLabel label1= new JLabel("Saic Tower, M-1/6, Mirpur-14");
		label1.setBounds(100,130,400,20);
		label1.setFont(f2);
		label1.setForeground(Color.white);
		JLabel label2= new JLabel("Email: relaxdrugs29@gmail.com");
		label2.setBounds(100,160,400,20);
		label2.setFont(f2);
		label2.setForeground(Color.white);
		JLabel label3= new JLabel("Contact Number: 01827185744");
		label3.setBounds(100,190,400,20);
		label3.setFont(f2);
		label3.setForeground(Color.white);
		JLabel label4= new JLabel("Recipt No: ");
		label4.setBounds(100,220,400,20);
		label4.setFont(f2);
		label4.setForeground(Color.white);
		JLabel label5= new JLabel("Employee ID: ");
		label5.setBounds(100,250,400,20);
		label5.setFont(f2);
		label5.setForeground(Color.white);
		JLabel label6= new JLabel("Date: ");
		label6.setBounds(100,280,400,20);
		label6.setFont(f2);           
		label6.setForeground(Color.white);
		JLabel label7= new JLabel("Total Price: ");
		label7.setBounds(700,350,400,20);
		label7.setFont(f2);           
		JLabel label8= new JLabel();
		label8.setBounds(800,350,400,20);
		label8.setFont(f2);           
		
		//textField
		JTextField tf1= new JTextField();
		tf1.setBounds(195,220,120,20);
		tf1.setFont(f2);
		JTextField tf2= new JTextField();
		tf2.setBounds(220,250,120,20);
		tf2.setFont(f2);
		JTextField tf3= new JTextField();
		tf3.setBounds(150,280,120,20);
		tf3.setFont(f2);
		
		//table
		String[] cols = {"Trend Name", "Quantity", "Price", "Total Price"};
		String[][] rows = {
							{"","","","",""},
							{"","","","",""}, 
							{"","","","",""}, 
							{"","","","",""}, 
							{"","","","",""}, 
							{"","","","",""}, 
							{"","","","",""}, 
							{"","","","",""}, 
							{"","","","",""}, 
							{"","","","",""}, 
														
						  };
		table = new JTable(rows,cols);
		
		//ScrollPanel
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(0,0,940,350);
		
		//button
		JButton button1 = new JButton();
		icon = new ImageIcon("back.png");
		button1.setIcon(icon);
		button1.setBounds(50,50,50,50);
		
		JButton button2 = new JButton("Calculate");
		button2.setBounds(800,375,100,20);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				HomeGUI s = new HomeGUI();
				s.setVisible(true);
			}
		});
		
		button2.addActionListener((ActionEvent a) -> {
                    Drug d = new Drug();
					//for(int i=0;i<1;i++)
                    //{
                    //System.out.println(String.valueOf(table.getModel().getValueAt(i,0)));
                    if(!"".equals(String.valueOf(table.getModel().getValueAt(0,0))))
                    {
                        String drug = String.valueOf(table.getModel().getValueAt(0,0));
                        TransactionController controller = new TransactionController();
                        d = controller.searchPrice(drug);
						System.out.println(d.getPrice());
                        
                        label8.setText("dasd");
                        
                    }
                    //}
                    //int i = Integer.parseInt((String) table.getModel().getValueAt(1,1));
                    //label8.setText(String.valueOf(i));
                });
		
		
		panel2.add(scroll);
		panel2.add(label7);
		panel2.add(label8);
		panel2.add(button2);
		c.add(panel2);
		c.add(button1);
		c.add(label1);
		c.add(label2);
		c.add(label3);
		c.add(label4);
		c.add(label5);
		c.add(label6);
		c.add(header);
		c.add(tf1);
		c.add(tf2);
		c.add(tf3);
		//c.add(logo);
		c.add(panel1);
		
	}
}